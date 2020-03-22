package com.cjppo.backend.war.apimodel.read;

import java.io.Serializable;

/**
 * @author: jie_cao
 * @create: 2020-03-22 16:48
 **/
public class ReadUserRequest  implements Serializable {
    private String uid;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
