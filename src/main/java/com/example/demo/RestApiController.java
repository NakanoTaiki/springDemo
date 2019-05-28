package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/sample")
public class RestApiController {

    @RequestMapping(value = "/hello")
    public String index() {
        return "Hello World!";
    }
}