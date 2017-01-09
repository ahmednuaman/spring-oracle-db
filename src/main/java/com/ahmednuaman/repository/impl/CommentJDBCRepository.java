package com.ahmednuaman.repository.impl;

import com.ahmednuaman.model.Read;
import com.ahmednuaman.model.ReadRequest;
import com.ahmednuaman.model.WriteRequest;
import com.ahmednuaman.repository.CommentRepository;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;

import java.time.ZonedDateTime;
import java.util.List;

public class CommentJDBCRepository implements CommentRepository {

    private final JdbcTemplate jdbcTemplate;

    @Value("${spring.datasource.table}")
    private String table;

    @Autowired
    public CommentJDBCRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void write(WriteRequest writeRequest) {

    }

    @Override
    public List<Read> read(ReadRequest readRequest) {
        String sql = String.format(
                "SELECT * FROM %s WHERE application = `%s` AND sheetId = `%s`",
                table,
                readRequest.getApplication(),
                readRequest.getSheetId());

        if (readRequest.hasSince()) {
            sql += String.format(" AND datetime >= `%s`", readRequest.getSince().toString());
        }

        sql += " ORDER BY datetime DESC";

        if (readRequest.hasCount()) {
            sql = String.format("SELECT * FROM (%s) WHERE ROWNUM <= %s", sql, readRequest.getCount());
        }

        return jdbcTemplate.query(sql,
                (result, rows) ->
                        new Read(result.getString("NTName"),
                                 result.getString("application"),
                                 result.getString("sheetId"),
                                 result.getString("currentSelections"),
                                 result.getString("commentary"),
                                 new JSONObject(result.getBlob("payload")),
                                 ZonedDateTime.parse(result.getString("datetime")))
        );
    }

}
