package com.example.task11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task11MainTest {

    @Test
    public void testSwap() {
        int[] arr;

        arr = new int[]{7, 5, 9};
        Task11Main.swap(arr);
        Assertions.assertArrayEquals(new int[]{5, 7, 9}, arr);

        arr = new int[]{5, 5, 5};
        Task11Main.swap(arr);
        Assertions.assertArrayEquals(new int[]{5, 5, 5}, arr);

        arr = new int[]{9, 11, 7, 8};
        Task11Main.swap(arr);
        Assertions.assertArrayEquals(new int[]{7, 11, 9, 8}, arr);

        arr = new int[]{-3, 4, -9, 2};
        Task11Main.swap(arr);
        Assertions.assertArrayEquals(new int[]{-9, 4, -3, 2}, arr, "отрицательные числа тоже участвуют в поиске минимума");
    }

    /**
     * Поиск минимума должен начинаться с элемента с индексом 0, иначе уже стоящий на своём месте минимум
     * будет переставлен с каким-то другим элементом и массив испортится.
     */
    @Test
    public void testSwapWhenMinIsAlreadyFirst() {
        int[] arr;

        arr = new int[]{1, 5, 9};
        Task11Main.swap(arr);
        Assertions.assertArrayEquals(new int[]{1, 5, 9}, arr);

        arr = new int[]{-7, 4, 0, 2};
        Task11Main.swap(arr);
        Assertions.assertArrayEquals(new int[]{-7, 4, 0, 2}, arr);

        arr = new int[]{5};
        Task11Main.swap(arr);
        Assertions.assertArrayEquals(new int[]{5}, arr, "в массиве из одного элемента он же и минимум");
    }

    @Test
    public void testSwapDoesNotFailOnEmptyAndNull() {
        int[] arr = new int[]{};
        Task11Main.swap(arr);
        Assertions.assertArrayEquals(new int[]{}, arr, "если пришедший массив пуст, то ничего делать не нужно");

        // если пришёл null, то метод должен просто ничего не делать, а не падать с NullPointerException
        Task11Main.swap(null);
    }

}
