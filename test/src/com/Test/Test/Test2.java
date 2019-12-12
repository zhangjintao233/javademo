package com.Test.Test;


public class Test2 {
    public static void main(String[] atgs) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(gt(arr, 8));

    }

    public static int gt(int[] arr, int a) {
        int min = 0;
        int max = arr.length;


        while (min <= max) {
            int mid = (min + max) / 2;
            if (a == arr[mid]) {
                return mid;
            } else if (a > arr[mid]) {
                min = mid + 1;
            } else if (a < arr[mid]) {
                max = mid - 1;
            }
        }

        return -1;
    }

}

