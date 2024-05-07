package com.congo.helloWorld2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //must specify that this is a REST api
@RequestMapping("/api/hello") //must specify the end point of the api
public class HelloController {

    @GetMapping
    public String getText(){
        return "Hello World Thanks for watching bye";
    }

}
