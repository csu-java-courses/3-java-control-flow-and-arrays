package com.example.task03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task03MainTest {

    private static final String NOT_EXISTS = "такого дня недели не существует";

    @Test
    public void testGetNameOfWeekDays() {
        Assertions.assertEquals("понедельник", Task03Main.getNameOfWeekDays(1), "1 - понедельник");
        Assertions.assertEquals("вторник", Task03Main.getNameOfWeekDays(2), "2 - вторник");
        Assertions.assertEquals("среда", Task03Main.getNameOfWeekDays(3), "3 - среда");
        Assertions.assertEquals("четверг", Task03Main.getNameOfWeekDays(4), "4 - четверг");
        Assertions.assertEquals("пятница", Task03Main.getNameOfWeekDays(5), "5 - пятница");
        Assertions.assertEquals("суббота", Task03Main.getNameOfWeekDays(6), "6 - суббота");
        Assertions.assertEquals("воскресенье", Task03Main.getNameOfWeekDays(7), "7 - воскресенье");
    }

    /**
     * Легко забыть про номера вне диапазона 1..7 и вернуть для них название какого-нибудь дня недели.
     */
    @Test
    public void testGetNameOfWeekDaysOutOfRange() {
        Assertions.assertEquals(NOT_EXISTS, Task03Main.getNameOfWeekDays(0), "0 - дня недели с таким номером нет");
        Assertions.assertEquals(NOT_EXISTS, Task03Main.getNameOfWeekDays(8), "8 - дня недели с таким номером нет");
        Assertions.assertEquals(NOT_EXISTS, Task03Main.getNameOfWeekDays(-1), "-1 - дня недели с таким номером нет");
        Assertions.assertEquals(NOT_EXISTS, Task03Main.getNameOfWeekDays(100), "100 - дня недели с таким номером нет");
        Assertions.assertEquals(NOT_EXISTS, Task03Main.getNameOfWeekDays(Integer.MIN_VALUE));
        Assertions.assertEquals(NOT_EXISTS, Task03Main.getNameOfWeekDays(Integer.MAX_VALUE));
    }

}
