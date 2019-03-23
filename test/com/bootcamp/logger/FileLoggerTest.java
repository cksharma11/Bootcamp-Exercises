package com.bootcamp.logger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileLoggerTest {

    @Test
    void shouldLogInFile() {
        FileLogger fileLogger = new FileLogger();
        String log = "Logged in file";
        String expected = "Logged in file";
        String actual = fileLogger.log(log);

        assertEquals(expected, actual);
    }
}