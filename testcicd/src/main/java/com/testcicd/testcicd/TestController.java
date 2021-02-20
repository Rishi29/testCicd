package com.testcicd.testcicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hey")
    public String testHello(){
        return "Hey there";
    }
}
