package com.cjppo.backend.war.apicontrollor;

import com.cjppo.backend.war.domain.User;
import com.cjppo.backend.war.service.UserBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private UserBuilder userBuilder;

    @PostMapping(value = "/login")
    public Boolean login(@RequestParam String uid, String pwd) {
        User user = userBuilder.buildUser(uid);
        if (user == null) {
            return false;
        }
        if (!user.getPwd().equalsIgnoreCase(pwd)) {
            return false;
        }
        return true;
    }

}
