package com.ahmednuaman.model;

import java.time.ZonedDateTime;

public class ReadRequest {

    private final String application;
    private final String sheetId;
    private int page = 0;
    private int count = 25;
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

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ZonedDateTime getSince() {
        return since;
    }

    public void setSince(String since) {
        this.since = ZonedDateTime.parse(since);
    }
}
