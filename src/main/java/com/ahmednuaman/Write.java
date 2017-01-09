package com.ahmednuaman;

import org.json.JSONObject;

/**
 * Created by ahmed on 09/01/2017.
 */
public class Write {

    private final String NTName;
    private final String application;
    private final String sheetId;
    private final String currentSelections;
    private final String commentary;
    private final JSONObject payload;

    public Write(String NTName,
                 String application,
                 String sheetId,
                 String currentSelections,
                 String commentary,
                 String payload) {
        this.NTName = NTName;
        this.application = application;
        this.sheetId = sheetId;
        this.currentSelections = currentSelections;
        this.commentary = commentary;
        this.payload = new JSONObject(payload);
    }

    public String getNTName() {
        return NTName;
    }

    public String getApplication() {
        return application;
    }
    
    public String getSheetId() {
        return sheetId;
    }
    
    public String getCurrentSelections() {
        return currentSelections;
    }
    
    public String getCommentary() {
        return commentary;
    }
    
    public JSONObject getPayload() {
        return payload;
    }
    
}
