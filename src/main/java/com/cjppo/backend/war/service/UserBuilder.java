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
public class UserBuilder {

    @Autowired
    @Qualifier("MongoDataReposity")
    private IDataReposity dataReposity;

    public User buildUser(String userName) {
        return dataReposity.findByUserName(userName);
    }
}
