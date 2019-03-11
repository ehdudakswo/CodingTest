package com.example.myapplication;

import java.util.PriorityQueue;

public class Sort {

    public int[] bubble(int[] inputs) {
        int[] arr = inputs.clone();
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public int[] selection(int[] inputs) {
        int[] arr = inputs.clone();
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return arr;
    }

    public int[] insertion(int[] inputs) {
        int[] arr = inputs.clone();
        int len = arr.length;

        for (int i = 1; i < len; i++) {
            int insert = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > insert) {
                    arr[j + 1] = arr[j];
                } else {
                    arr[j + 1] = insert;
                    break;
                }

                if (j == 0) {
                    arr[0] = insert;
                }
            }
        }

        return arr;
    }

    public int[] heap(int[] inputs) {
        int[] arr = inputs.clone();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int e : arr) {
            pq.add(e);
        }

        int idx = 0;
        while (!pq.isEmpty()) {
            arr[idx++] = pq.poll();
        }

        return arr;
    }

}