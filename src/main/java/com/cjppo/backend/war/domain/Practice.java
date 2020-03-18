package com.cjppo.backend.war.domain;

import java.util.Calendar;

/**
 * @author: jie_cao
 * @create: 2020-03-16 17:26
 **/
public class Practice {

    private String projectId;

    private String name;

    private Long lastingMinutes;

    private Calendar lastPracticeTime;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getLastingMinutes() {
        return lastingMinutes;
    }

    public void setLastingMinutes(Long lastingMinutes) {
        this.lastingMinutes = lastingMinutes;
    }

    public Calendar getLastPracticeTime() {
        return lastPracticeTime;
    }

    public void setLastPracticeTime(Calendar lastPracticeTime) {
        this.lastPracticeTime = lastPracticeTime;
    }
}
