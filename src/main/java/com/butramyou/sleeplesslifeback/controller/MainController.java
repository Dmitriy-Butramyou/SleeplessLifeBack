package com.butramyou.sleeplesslifeback.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    @Value("${foo}")
    private String testStr;

    @GetMapping()
    String getStr() {
        return "Work " + (testStr != null ? testStr : "----");
    }
}
