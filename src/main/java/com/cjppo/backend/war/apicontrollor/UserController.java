package com.cjppo.backend.war.apicontrollor;

import com.cjppo.backend.war.apimodel.Ack;
import com.cjppo.backend.war.apimodel.login.CreateUserRequest;
import com.cjppo.backend.war.apimodel.login.CreateUserResponse;
import com.cjppo.backend.war.apimodel.login.LoginRequest;
import com.cjppo.backend.war.apimodel.login.LoginResponse;
import com.cjppo.backend.war.domain.User;
import com.cjppo.backend.war.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @CrossOrigin
    @PostMapping(value = "/login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        LoginResponse response = new LoginResponse();
        response.setSuccess(false);
        response.setAck(Ack.Success);
        try {
            response.setUid(request.getUid());
            User user = userService.buildUser(request.getUid());
            if (user == null) {
                return response;
            }
            if (!user.getPwd().equalsIgnoreCase(request.getPwd())) {
                return response;
            }
            response.setSuccess(true);
            return response;
        }catch (Exception ex) {
            logger.error("login error", ex);
            return response;
        }
    }

    @CrossOrigin
    @PostMapping(value = "/createuser")
    public CreateUserResponse create(@RequestBody CreateUserRequest request) {
        CreateUserResponse response = new CreateUserResponse();
        response.setAck(Ack.Success);
        response.setSuccess(false);
        try {
            User existsUser = userService.buildUser(request.getUid());
            if (existsUser != null) {
                response.setMessage("username is already exists");
                return response;
            }
            User newUser = userService.createUser(request.getUid(), request.getPwd());
            if (newUser == null) {
                response.setMessage("ops, something wrong while creating a user, please try again");
                return response;
            }
            response.setSuccess(true);
            return response;
        }catch (Exception ex) {
            logger.error("login error", ex);
            response.setMessage("fail to communite with database, please try again");
            response.setSuccess(false);
            return response;
        }
    }

}
