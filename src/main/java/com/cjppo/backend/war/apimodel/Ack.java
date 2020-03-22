package com.cjppo.backend.war.apimodel;

import java.io.Serializable;

public enum Ack implements Serializable {
    Success,
    Fail,
    Warning;
}
