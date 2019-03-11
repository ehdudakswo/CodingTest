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

    @Test
    public void testHeap() {
        int[] sorted = new Sort().heap(arr);
        assertEquals(1, sorted[0]);
        assertEquals(3, sorted[1]);
        assertEquals(5, sorted[2]);
        assertEquals(7, sorted[3]);
        assertEquals(9, sorted[4]);
    }

    @Test
    public void testMerge() {
        int[] sorted = new Sort().merge(arr);
        assertEquals(1, sorted[0]);
        assertEquals(3, sorted[1]);
        assertEquals(5, sorted[2]);
        assertEquals(7, sorted[3]);
        assertEquals(9, sorted[4]);
    }

    @Test
    public void testQuick() {
        int[] sorted = new Sort().quick(arr);
        assertEquals(1, sorted[0]);
        assertEquals(3, sorted[1]);
        assertEquals(5, sorted[2]);
        assertEquals(7, sorted[3]);
        assertEquals(9, sorted[4]);
    }

    @Test
    public void testRadix() {
        int[] arr = {13, 212, 14, 7141, 10987, 6, 15};
        int[] sorted = new Sort().radix(arr);
        assertEquals(6, sorted[0]);
        assertEquals(13, sorted[1]);
        assertEquals(14, sorted[2]);
        assertEquals(15, sorted[3]);
        assertEquals(212, sorted[4]);
        assertEquals(7141, sorted[5]);
        assertEquals(10987, sorted[6]);
    }

}