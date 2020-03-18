package com.cjppo.backend.war.domain;

import com.cjppo.backend.war.domain.presist.IDataReposity;

import java.util.List;

/**
 * @author: jie_cao
 * @create: 2020-03-16 17:25
 **/
public class User {
    private String userId;

    private String user;

    private String pwd;

    private List<Practice> practices;

    private IDataReposity dataReposity;

    public boolean save() {
        return dataReposity.saveOrUpdate(this);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public List<Practice> getPractices() {
        return practices;
    }

    public void setPractices(List<Practice> practices) {
        this.practices = practices;
    }
}
