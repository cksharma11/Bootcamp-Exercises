package com.bootcamp.activitylog;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActivityLogTest {

    private ActivityLog activityLog;
    @BeforeEach
    void setUp() {
        activityLog = new ActivityLog();

    }

    @Test
    void shouldAddLog() {
        Log expected = new Log("first activity");
        Log actual = activityLog.addLog(new Log ("first activity"));

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnAllLogs() {
        activityLog.addLog(new Log("first activity"));
        activityLog.addLog(new Log("second activity"));

        List<Log> expectedLogs = new ArrayList<>();
        expectedLogs.add(new Log("first activity"));
        expectedLogs.add(new Log("second activity"));

        List<Log> actualLogs = activityLog.getLogs();

        assertEquals(expectedLogs, actualLogs);
    }
}