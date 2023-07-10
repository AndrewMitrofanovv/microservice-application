package com.example.eurekaclient.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/main")
public class TestController {



    @GetMapping("/test")
    public String test(){
        return "hello world";
    }
}
