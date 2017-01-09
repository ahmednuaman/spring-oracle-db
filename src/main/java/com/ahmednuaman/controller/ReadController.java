package com.ahmednuaman.controller;

import com.ahmednuaman.model.Read;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadController {

    @RequestMapping(method = RequestMethod.GET, path = "/read")
    public Read read(@RequestParam(value = "applicationId") String applicationId,
                     @RequestParam(value = "sheetId") String sheetId,
                     @RequestParam(value = "NTName") String NTName,
                     @RequestParam(value = "sessionTicket") String sessionTicket) {

    }

}
