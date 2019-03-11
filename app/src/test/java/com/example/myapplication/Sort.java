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

    public int[] merge(int[] inputs) {
        int[] arr = inputs.clone();
        int len = arr.length;

        merge(arr, 0, len - 1);

        return arr;
    }

    private void merge(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;
        merge(arr, left, mid);
        merge(arr, mid + 1, right);

        int[] temp = new int[right - left + 1];
        int t = 0;
        int l = left;
        int r = mid + 1;

        while (l <= mid && r <= right) {
            if (arr[l] < arr[r]) {
                temp[t++] = arr[l++];
            } else {
                temp[t++] = arr[r++];
            }
        }

        if (left > mid) {
            while (r <= right) {
                temp[t++] = arr[r++];
            }
        } else {
            while (l <= mid) {
                temp[t++] = arr[l++];
            }
        }

        for (int i = 0; i < temp.length; i++) {
            arr[i + left] = temp[i];
        }
    }

}