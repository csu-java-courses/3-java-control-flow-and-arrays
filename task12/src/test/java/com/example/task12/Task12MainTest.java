package com.example.task12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task12MainTest {

    @Test
    public void testSelectionSort() {
        int[] arr;

        arr = new int[]{7, 5, 9};
        Task12Main.selectionSort(arr);
        Assertions.assertArrayEquals(new int[]{5, 7, 9}, arr);

        arr = new int[]{5, 5, 5};
        Task12Main.selectionSort(arr);
        Assertions.assertArrayEquals(new int[]{5, 5, 5}, arr);

        arr = new int[]{9, 11, 7, 8};
        Task12Main.selectionSort(arr);
        Assertions.assertArrayEquals(new int[]{7, 8, 9, 11}, arr);

        arr = new int[]{5};
        Task12Main.selectionSort(arr);
        Assertions.assertArrayEquals(new int[]{5}, arr);
    }

    /**
     * Сравнивать нужно сами числа, а не их модули: -9 меньше чем 2, хотя |-9| больше чем |2|.
     */
    @Test
    public void testSelectionSortWithNegativeNumbers() {
        int[] arr;

        arr = new int[]{-3, 4, -9, 2};
        Task12Main.selectionSort(arr);
        Assertions.assertArrayEquals(new int[]{-9, -3, 2, 4}, arr);

        arr = new int[]{-1, -5, -3};
        Task12Main.selectionSort(arr);
        Assertions.assertArrayEquals(new int[]{-5, -3, -1}, arr);
    }

    /**
     * Уже отсортированный массив должен остаться неизменным, а полностью развёрнутый - худший случай для сортировки.
     */
    @Test
    public void testSelectionSortOnSortedAndReversedArrays() {
        int[] arr;

        arr = new int[]{1, 2, 3, 4, 5};
        Task12Main.selectionSort(arr);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);

        arr = new int[]{5, 4, 3, 2, 1};
        Task12Main.selectionSort(arr);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    /**
     * Повторяющиеся элементы не должны теряться или дублироваться при перестановках.
     */
    @Test
    public void testSelectionSortWithDuplicates() {
        int[] arr = {4, 1, 4, 0, 1, -2, 0};
        Task12Main.selectionSort(arr);
        Assertions.assertArrayEquals(new int[]{-2, 0, 0, 1, 1, 4, 4}, arr);
    }

    @Test
    public void testSelectionSortDoesNotFailOnEmptyAndNull() {
        int[] arr = new int[]{};
        Task12Main.selectionSort(arr);
        Assertions.assertArrayEquals(new int[]{}, arr, "если пришедший массив пуст, то ничего делать не нужно");

        // если пришёл null, то метод должен просто ничего не делать, а не падать с NullPointerException
        Task12Main.selectionSort(null);
    }

}
