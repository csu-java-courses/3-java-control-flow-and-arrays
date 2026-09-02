package com.example.task01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task01MainTest {

    @Test
    public void testCanGetDriverLicense() {
        Assertions.assertTrue(Task01Main.canGetDriverLicense(18), "В 18 можно получить права");
        Assertions.assertTrue(Task01Main.canGetDriverLicense(19), "В 19 можно получить права");
        Assertions.assertTrue(Task01Main.canGetDriverLicense(99), "В 99 можно получить права");

        Assertions.assertFalse(Task01Main.canGetDriverLicense(17), "В 17 нельзя получить права");
        Assertions.assertFalse(Task01Main.canGetDriverLicense(7), "В 7 нельзя получить права");
        Assertions.assertFalse(Task01Main.canGetDriverLicense(1), "В 1 нельзя получить права");
    }

}
