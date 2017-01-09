package com.ahmednuaman;

import org.json.JSONObject;

import java.time.ZonedDateTime;

public class Read {

    private final String NTName;
    private final String currentSelections;
    private final String commentary;
    private final String payload;
    private final String datetime;

    public Read(String NTName,
                String application,
                String sheetId,
                String currentSelections,
                String commentary,
                JSONObject payload,
                ZonedDateTime datetime) {
        this.NTName = NTName;
        this.currentSelections = currentSelections;
        this.commentary = commentary;
        this.payload = payload.toString();
        this.datetime = datetime.toString();
    }

    public String getNTName() {
        return NTName;
    }
    
    public String getCurrentSelections() {
        return currentSelections;
    }
    
    public String getCommentary() {
        return commentary;
    }
    
    public String getPayload() {
        return payload;
    }

    public String getDatetime() {
        return datetime;
    }
}
