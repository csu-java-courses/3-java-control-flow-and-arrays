package com.example.task04;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Task04MainTest {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalSystemOut = System.out;

    @BeforeEach
    public void setUpSystemOut() {
        System.setOut(new PrintStream(out));
    }

    @AfterEach
    public void cleanUpSystemOut() {
        System.setOut(originalSystemOut);
    }

    @Test
    public void testFrom0to10000() {
        Task04Main.from0to10000();
        String actual = out.toString();
        StringBuilder expected = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            expected.append(i);
            expected.append(System.lineSeparator());
        }
        Assertions.assertEquals(expected.toString(), actual);
    }

}