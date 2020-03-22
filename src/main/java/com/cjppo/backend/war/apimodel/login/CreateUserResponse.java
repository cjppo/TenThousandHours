package com.cjppo.backend.war.apimodel.login;

import com.cjppo.backend.war.apimodel.Ack;

import java.io.Serializable;

/**
 * @author: jie_cao
 * @create: 2020-03-22 17:13
 **/
public class CreateUserResponse implements Serializable {
    private Ack ack;
    private Boolean success;
    private String message;

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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
