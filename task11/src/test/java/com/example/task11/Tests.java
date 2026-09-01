package com.example.task11;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testSwap() {
        int[] arr;

        arr = new int[]{7, 5, 9};
        Task11Main.swap(arr);
        Assert.assertArrayEquals(new int[]{5, 7, 9}, arr);

        arr = new int[]{5, 5, 5};
        Task11Main.swap(arr);
        Assert.assertArrayEquals(new int[]{5, 5, 5}, arr);

        arr = new int[]{9, 11, 7, 8};
        Task11Main.swap(arr);
        Assert.assertArrayEquals(new int[]{7, 11, 9, 8}, arr);

        arr = new int[]{-3, 4, -9, 2};
        Task11Main.swap(arr);
        Assert.assertArrayEquals("отрицательные числа тоже участвуют в поиске минимума", new int[]{-9, 4, -3, 2}, arr);
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
        Assert.assertArrayEquals(new int[]{1, 5, 9}, arr);

        arr = new int[]{-7, 4, 0, 2};
        Task11Main.swap(arr);
        Assert.assertArrayEquals(new int[]{-7, 4, 0, 2}, arr);

        arr = new int[]{5};
        Task11Main.swap(arr);
        Assert.assertArrayEquals("в массиве из одного элемента он же и минимум", new int[]{5}, arr);
    }

    @Test
    public void testSwapDoesNotFailOnEmptyAndNull() {
        int[] arr = new int[]{};
        Task11Main.swap(arr);
        Assert.assertArrayEquals("если пришедший массив пуст, то ничего делать не нужно", new int[]{}, arr);

        // если пришёл null, то метод должен просто ничего не делать, а не падать с NullPointerException
        Task11Main.swap(null);
    }

}
