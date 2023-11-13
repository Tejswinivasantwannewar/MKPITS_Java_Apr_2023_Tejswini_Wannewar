package com.example.bankingapplication_mvc_jsp;

import java.security.Timestamp;

public class LogDetails {
    public LogDetails() {
    }
    private Timestamp logTime;
    private String task;
    private String userId;

    public LogDetails(Timestamp logTime, String task, String userId) {
        this.logTime = logTime;
        this.task = task;
        this.userId = userId;
    }

    public Timestamp getLogTime() {
        return logTime;
    }

    public void setLogTime(Timestamp logTime) {
        this.logTime = logTime;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
