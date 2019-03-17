package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchTest {

    private int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

    @Test
    public void testRepetitive() {
        assertEquals(-1, new Search().repetitive(arr, 0));
        assertEquals(-1, new Search().repetitive(arr, 2));
        assertEquals(-1, new Search().repetitive(arr, 4));
        assertEquals(-1, new Search().repetitive(arr, 6));
        assertEquals(-1, new Search().repetitive(arr, 8));
        assertEquals(-1, new Search().repetitive(arr, 10));
        assertEquals(-1, new Search().repetitive(arr, 12));
        assertEquals(-1, new Search().repetitive(arr, 14));
        assertEquals(-1, new Search().repetitive(arr, 16));
        assertEquals(-1, new Search().repetitive(arr, 18));
        assertEquals(-1, new Search().repetitive(arr, 20));

        assertEquals(0, new Search().repetitive(arr, 1));
        assertEquals(1, new Search().repetitive(arr, 3));
        assertEquals(2, new Search().repetitive(arr, 5));
        assertEquals(3, new Search().repetitive(arr, 7));
        assertEquals(4, new Search().repetitive(arr, 9));
        assertEquals(5, new Search().repetitive(arr, 11));
        assertEquals(6, new Search().repetitive(arr, 13));
        assertEquals(7, new Search().repetitive(arr, 15));
        assertEquals(8, new Search().repetitive(arr, 17));
        assertEquals(9, new Search().repetitive(arr, 19));
    }

}