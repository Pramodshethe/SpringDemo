package com.pramod.shethe.SpringBootDemo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="greetings",produces = MediaType.APPLICATION_JSON_VALUE)
public class Greetings {
    @RequestMapping(method = RequestMethod.GET)
    public String greetingabc(){
        return "hi hello";
    }
}
