package com.bootcamp.activitylog;

import java.util.ArrayList;
import java.util.List;

class ActivityLog {
    private List<Log> logs;

    ActivityLog() {
        this.logs = new ArrayList<>();
    }

    Log addLog(Log log) {
        this.logs.add(log);
        return log;
    }

    List<Log> getLogs() {
        return this.logs;
    }
}
