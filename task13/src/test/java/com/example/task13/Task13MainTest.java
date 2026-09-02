package com.example.task13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task13MainTest {

    @Test
    public void testRemoveMoreThen1000() {
        Assertions.assertArrayEquals(new int[]{9, 7, 8}, Task13Main.removeMoreThen1000(new int[]{9, 1100, 7, 8}));

        Assertions.assertArrayEquals(new int[]{9, 8},
                                  Task13Main.removeMoreThen1000(new int[]{9, 1100, 5000, 8, 1001}),
                                  "удалять нужно все большие элементы, а не только первый найденный");

        Assertions.assertArrayEquals(new int[]{-5, 0, 17},
                                  Task13Main.removeMoreThen1000(new int[]{-5, 0, 17}),
                                  "отрицательные числа меньше 1000, их удалять не нужно");

        Assertions.assertArrayEquals(new int[]{1, 2, 3},
                                  Task13Main.removeMoreThen1000(new int[]{1, 2, 3}),
                                  "если больших элементов нет, то массив должен остаться прежним");

        Assertions.assertArrayEquals(new int[]{},
                                  Task13Main.removeMoreThen1000(new int[]{1001, 2000, 3000}),
                                  "если все элементы большие, то результат - пустой массив");

        Assertions.assertArrayEquals(new int[]{}, Task13Main.removeMoreThen1000(new int[]{}));

        Assertions.assertArrayEquals(null, Task13Main.removeMoreThen1000(null));
    }

    /**
     * Удаляются элементы _больше_ 1000, поэтому сама 1000 должна остаться, а 1001 - нет.
     */
    @Test
    public void testRemoveMoreThen1000Boundary() {
        Assertions.assertArrayEquals(new int[]{1000}, Task13Main.removeMoreThen1000(new int[]{1000}), "1000 не больше 1000, её удалять не нужно");

        Assertions.assertArrayEquals(new int[]{}, Task13Main.removeMoreThen1000(new int[]{1001}), "1001 больше 1000, её нужно удалить");

        Assertions.assertArrayEquals(new int[]{999, 1000}, Task13Main.removeMoreThen1000(new int[]{999, 1000, 1001}));
    }

    /**
     * Метод должен возвращать новый массив, а исходный оставлять нетронутым.
     */
    @Test
    public void testModification() {
        int[] originalArray = {9, 1100, 7, 8};
        int[] argumentArray = originalArray.clone();

        int[] result = Task13Main.removeMoreThen1000(argumentArray);

        Assertions.assertArrayEquals(new int[]{9, 7, 8}, result);
        Assertions.assertArrayEquals(originalArray, argumentArray, "Переданный в метод массив был изменен");
    }

}
