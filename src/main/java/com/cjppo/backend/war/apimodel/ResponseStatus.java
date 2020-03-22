package com.cjppo.backend.war.apimodel;

import java.io.Serializable;

/**
 * @author: jie_cao
 * @create: 2020-03-22 16:51
 **/
public class ResponseStatus implements Serializable {
    private Ack ack;

    public Ack getAck() {
        return ack;
    }

    public void setAck(Ack ack) {
        this.ack = ack;
    }
}
