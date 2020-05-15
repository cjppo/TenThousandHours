package com.cjppo.backend.war.apicontrollor;

import org.springframework.web.bind.annotation;
import com.cjppo.backend.war.apimodel.read.ReadUserRequest;
import com.cjppo.backend.war.apimodel.read.ReadUserResponse;
import com.cjppo.backend.war.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/read")
@RestController
public class ReadController {

    @Autowired
    private UserService userBuilder;
    private Logger logger = LoggerFactory.getLogger(ReadController.class);

    @CrossOrigin
    @PostMapping(value = "/user")
    public ReadUserResponse getUser(@RequestBody ReadUserRequest request) {
        ReadUserResponse response = new ReadUserResponse();
        try {
            response.setUser(userBuilder.buildUser(request.getUid()));
        }catch (Exception ex) {
            logger.error("readuser error", ex);
        }
        return response;
    }
}
