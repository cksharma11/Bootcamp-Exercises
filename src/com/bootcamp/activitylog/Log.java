package com.bootcamp.activitylog;

import java.util.Date;
import java.util.Objects;

class Log {
    private String log;
    private Date timeStamp;

    Log(String log) {
        this.log = log;
    }

    public Log(String log, Date timeStamp) {
        this.log = log;
        this.timeStamp = timeStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Log log1 = (Log) o;
        return Objects.equals(log, log1.log) &&
                Objects.equals(timeStamp, log1.timeStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(log, timeStamp);
    }
}
