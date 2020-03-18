package com.cjppo.backend.war.dao.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author: jie_cao
 * @create: 2020-03-16 17:07
 **/
@Document(collection = "tenthousandhoursdb")
public class UserEntity {

    @Id
    private String userId;

    private String user;

    private String pwd;

    private List<PracticeEntity> practices;

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

    public List<PracticeEntity> getPractices() {
        return practices;
    }

    public void setPractices(List<PracticeEntity> practices) {
        this.practices = practices;
    }
}
