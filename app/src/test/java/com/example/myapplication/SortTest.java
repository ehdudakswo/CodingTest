package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortTest {

    private int[] arr = {9, 7, 5, 3, 1};

    @Test
    public void testBubble() {
        int[] sorted = new Sort().bubble(arr);
        assertEquals(1, sorted[0]);
        assertEquals(3, sorted[1]);
        assertEquals(5, sorted[2]);
        assertEquals(7, sorted[3]);
        assertEquals(9, sorted[4]);
    }

    @Test
    public void testSelection() {
        int[] sorted = new Sort().selection(arr);
        assertEquals(1, sorted[0]);
        assertEquals(3, sorted[1]);
        assertEquals(5, sorted[2]);
        assertEquals(7, sorted[3]);
        assertEquals(9, sorted[4]);
    }

    @Test
    public void testInsertion() {
        int[] sorted = new Sort().insertion(arr);
        assertEquals(1, sorted[0]);
        assertEquals(3, sorted[1]);
        assertEquals(5, sorted[2]);
        assertEquals(7, sorted[3]);
        assertEquals(9, sorted[4]);
    }

}