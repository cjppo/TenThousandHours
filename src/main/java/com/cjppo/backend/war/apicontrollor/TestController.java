package com.cjppo.backend.war.apicontrollor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

    @CrossOrigin
    @GetMapping(value = "/show")
    public String getUser() {
        return "ok";
    }
}
