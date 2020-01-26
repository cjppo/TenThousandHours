package com.cjppo.backend.war.apicontrollor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/user")
public class LoginController {

    @RequestMapping(value = "/login", method = POST)
    public Boolean login(@RequestParam String uid, String pwd) {
        //todo
        //maybe implement by aop
        //username and pwd identify
        return true;
    }

}
