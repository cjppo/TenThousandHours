package com.cjppo.backend.war.apimodel.login;

import java.io.Serializable;

/**
 * @author: jie_cao
 * @create: 2020-03-22 16:42
 **/
public class LoginRequest implements Serializable {
    private String uid;
    private String pwd;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
