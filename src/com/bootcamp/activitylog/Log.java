package com.bootcamp.activitylog;

import java.util.Date;
import java.util.Objects;

class Log {
    private String log;
    private Date timeStamp;

    Log(String log) {
        this.log = log;
        this.timeStamp = new Date();
    }


    @Override
    public String toString() {
        return "Log{" +
                "log='" + log + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Log log1 = (Log) o;
        return Objects.equals(log, log1.log);
    }

    @Override
    public int hashCode() {
        return Objects.hash(log, timeStamp);
    }
}
