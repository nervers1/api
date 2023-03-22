package com.hanwhawm.api.controller;


import com.hanwhawm.api.domains.CurrentTime;
import com.hanwhawm.api.service.ApiService;
import com.hanwhawm.api.util.JSONParser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    public ApiController(ApiService service, JSONParser parser) {
        this.service = service;
        this.parser = parser;
    }

    ApiService service;

    JSONParser parser;

    @Value("$(json.path")
    private String jsonPath;

    @RequestMapping(value = {"", "/"})
    public CurrentTime getTime() {
        CurrentTime time = service.getTime();
        return time;
    }
}
