package com.cjppo.backend.war.apimodel.read;

import com.cjppo.backend.war.domain.User;

import java.io.Serializable;

/**
 * @author: jie_cao
 * @create: 2020-03-22 16:50
 **/
public class ReadUserResponse implements Serializable {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
