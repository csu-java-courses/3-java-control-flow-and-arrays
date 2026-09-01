package com.example.task03;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    private static final String NOT_EXISTS = "такого дня недели не существует";

    @Test
    public void testGetNameOfWeekDays() {
        Assert.assertEquals("1 - понедельник", "понедельник", Task03Main.getNameOfWeekDays(1));
        Assert.assertEquals("2 - вторник", "вторник", Task03Main.getNameOfWeekDays(2));
        Assert.assertEquals("3 - среда", "среда", Task03Main.getNameOfWeekDays(3));
        Assert.assertEquals("4 - четверг", "четверг", Task03Main.getNameOfWeekDays(4));
        Assert.assertEquals("5 - пятница", "пятница", Task03Main.getNameOfWeekDays(5));
        Assert.assertEquals("6 - суббота", "суббота", Task03Main.getNameOfWeekDays(6));
        Assert.assertEquals("7 - воскресенье", "воскресенье", Task03Main.getNameOfWeekDays(7));
    }

    /**
     * Легко забыть про номера вне диапазона 1..7 и вернуть для них название какого-нибудь дня недели.
     */
    @Test
    public void testGetNameOfWeekDaysOutOfRange() {
        Assert.assertEquals("0 - дня недели с таким номером нет", NOT_EXISTS, Task03Main.getNameOfWeekDays(0));
        Assert.assertEquals("8 - дня недели с таким номером нет", NOT_EXISTS, Task03Main.getNameOfWeekDays(8));
        Assert.assertEquals("-1 - дня недели с таким номером нет", NOT_EXISTS, Task03Main.getNameOfWeekDays(-1));
        Assert.assertEquals("100 - дня недели с таким номером нет", NOT_EXISTS, Task03Main.getNameOfWeekDays(100));
        Assert.assertEquals(NOT_EXISTS, Task03Main.getNameOfWeekDays(Integer.MIN_VALUE));
        Assert.assertEquals(NOT_EXISTS, Task03Main.getNameOfWeekDays(Integer.MAX_VALUE));
    }

}
