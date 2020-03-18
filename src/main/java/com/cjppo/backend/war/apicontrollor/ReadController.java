package com.cjppo.backend.war.apicontrollor;

import com.cjppo.backend.war.domain.User;
import com.cjppo.backend.war.service.UserBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/read")
@RestController
public class ReadController {

    @Autowired
    private UserBuilder userBuilder;

    @PostMapping(value = "/user")
    public User getUser(String uid) {
        return userBuilder.buildUser(uid);
    }
}
