package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static int binarySearch(Integer[] arr, int item) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid].compareTo(item) == 0) {
                return mid;
            } else if (arr[mid].compareTo(item) < 0) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        for (int out = 1; out < arr.length; out++) {
            int temp = arr[out];
            int in = out;
            while (in > 0 && arr[in - 1] >= temp) {
                arr[in] = arr[in - 1];
                in--;
            }
            arr[in] = temp;
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr1 = new int[100_000];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rand.nextInt(1000);
        }
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        int[] arr3 = Arrays.copyOf(arr1, arr1.length);

        long start = System.currentTimeMillis();
        bubbleSort(arr1);
        long time = System.currentTimeMillis() - start;
        System.out.println("bubbleSort " + time);

        start = System.currentTimeMillis();
        selectionSort(arr2);
        time = System.currentTimeMillis() - start;
        System.out.println("selectionSort " + time);

        start = System.currentTimeMillis();
        insertionSort(arr3);
        time = System.currentTimeMillis() - start;
        System.out.println("insertionSort " + time);

        Integer[] arr = {1, 2, 3, 4, 5};
        System.out.println(binarySearch(arr, 1));
        System.out.println(binarySearch(arr, 3));
        System.out.println(binarySearch(arr, 5));
        System.out.println(binarySearch(arr, 6));
    }
}
