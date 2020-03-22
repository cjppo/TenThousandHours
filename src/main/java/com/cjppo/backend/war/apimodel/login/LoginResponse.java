package com.cjppo.backend.war.apimodel.login;

import com.cjppo.backend.war.apimodel.Ack;

import java.io.Serializable;

/**
 * @author: jie_cao
 * @create: 2020-03-22 16:42
 **/
public class LoginResponse implements Serializable {
    private Ack ack;
    private String uid;
    private Boolean success;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Ack getAck() {
        return ack;
    }

    public void setAck(Ack ack) {
        this.ack = ack;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
