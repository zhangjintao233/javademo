package com.Test.Test;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {10, 30, 60, 20, 40, 50, 70, 90};
        kuai(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(+i + "    ");
        }
        System.out.println();
        System.out.println(cha(arr, 60));

    }

    public static void kuai(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int kye = arr[left];
        int i = left;
        int j = right;

        while (i < j) {
            while (arr[j] >= kye && i < j) {
                j--;
            }
            while (arr[i] <= kye && i < j) {
                i++;
            }

            if (i < j) {
                int a = arr[i];
                arr[i] = arr[j];
                arr[j] = a;
            }
        }
        arr[left] = arr[i];
        arr[i] = kye;
        kuai(arr, left, j - 1);
        kuai(arr, i + 1, right);
    }

    public static int cha(int[] arr, int a) {
        int b = 0;
        int c = arr.length;
        //10 20 30 40 50 60 70 80 90
        while (b <= c) {
            int x = (b + c) / 2;
            if (a == arr[x]) {
                return x;
            } else if (a > arr[x]) {
                b = x + 1;
            } else if (a < arr[x]) {
                c = x - 1;
            }
        }
        return -1;
    }
}
