package com.cjppo.backend.war.service;

import com.cjppo.backend.war.domain.User;
import com.cjppo.backend.war.domain.presist.IDataReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author: jie_cao
 * @create: 2020-03-16 17:43
 **/
@Component
public class UserService {

    @Autowired
    @Qualifier("MongoDataReposityImpl")
    private IDataReposity dataReposity;

    public User buildUser(String userName) {
        return dataReposity.findByUserName(userName);
    }

    public User createUser(String userName, String pwd) {
        User newUser = new User();
        newUser.setPwd(pwd);
        newUser.setUser(userName);
        boolean isSuccess = dataReposity.saveOrUpdate(newUser);
        if (isSuccess) {
            return newUser;
        }else {
            return null;
        }
    }
}
