package com.ahmednuaman.model;

import java.time.ZonedDateTime;

public class ReadRequest {

    private final String application;
    private final String sheetId;
    private Integer page = 0;
    private Integer count = 25;
    private ZonedDateTime since;

    public ReadRequest(String application,
                       String sheetId) {
        this.application = application;
        this.sheetId = sheetId;
    }

    public String getApplication() {
        return application;
    }

    public String getSheetId() {
        return sheetId;
    }

    public boolean hasPage() {
        return page != null;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public boolean hasCount() {
        return count != null;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public boolean hasSince() {
        return since != null;
    }

    public ZonedDateTime getSince() {
        return since;
    }

    public void setSince(String since) {
        this.since = ZonedDateTime.parse(since);
    }
}
