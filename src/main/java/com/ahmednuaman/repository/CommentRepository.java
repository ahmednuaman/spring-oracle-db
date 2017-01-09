package com.ahmednuaman.repository;

import com.ahmednuaman.model.Read;
import com.ahmednuaman.model.ReadRequest;
import com.ahmednuaman.model.WriteRequest;

import java.util.List;

public interface CommentRepository {

    public List<Read> read(ReadRequest readRequest);

    public void write(WriteRequest writeRequest);

}
