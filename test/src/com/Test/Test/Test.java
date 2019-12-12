package com.Test.Test;

public class Test {
    public static void main(String[] atgs){
        int[] arr = {2,1,5,3,8,4,9,7};
        for (int i = 0;i<arr.length-1;i++){
            for (int f = 0;f<arr.length-1;f++){
                if (arr[f] > arr[f+1]){
                    int a = arr[f+1];
                    arr[f+1] = arr[f];
                    arr[f] = a;
                }
            }
        }
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
//        System.out.println(gt(arr, 8));
    }

//    public static int gt(int[] arr, int a) {
//        int min = 0;
//        int max = arr.length;
//
//
//        while (min <= max) {
//            int mid = (min + max) / 2;
//            if (a == arr[mid]) {
//                return mid;
//            } else if (a > arr[mid]) {
//                min = mid + 1;
//            } else if (a < arr[mid]) {
//                max = mid - 1;
//            }
//        }
//
//        return -1;
//    }

}
