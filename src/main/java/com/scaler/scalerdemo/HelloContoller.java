package com.scaler.scalerdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoller {
    //Get call-> /hello ->Hello World with httpstatus code-> 200 ok
    @GetMapping("/hi")
    public ResponseEntity helloworld()
    {
        person p=new person("Ishma",23, "Hello Ish");
        //String hello="Hello World";
        return ResponseEntity.ok(p);
    }
}
