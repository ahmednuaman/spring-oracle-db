package com.ahmednuaman.controller;

import com.ahmednuaman.model.Read;
import com.ahmednuaman.model.ReadRequest;
import com.ahmednuaman.repository.CommentRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReadController {

    private CommentRepository commentRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/read")
    public List<Read> read(@RequestParam(value = "applicationId") String applicationId,
                           @RequestParam(value = "sheetId") String sheetId,
                           @RequestParam(value = "NTName") String NTName,
                           @RequestParam(value = "sessionTicket") String sessionTicket,
                           @RequestParam(value = "count", required = false) Integer count,
                           @RequestParam(value = "page", required = false) Integer page,
                           @RequestParam(value = "since", required = false) String since) {
        ReadRequest readRequest = new ReadRequest(applicationId, sheetId);

        if (count != null) {
            readRequest.setCount(count);
        }

        if (page != null) {
            readRequest.setPage(page);
        }

        if (since != null) {
            readRequest.setSince(since);
        }

        return commentRepository.read(readRequest);
    }

}
