package com.bootcamp.logger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsoleLoggerTest {

    @Test
    void shouldLogOnConsole() {
        ConsoleLogger consoleLogger = new ConsoleLogger();
        String log = "Logged on console";
        String expected = "Logged on console";
        String actual = consoleLogger.log(log);

        assertEquals(expected, actual);
    }
}