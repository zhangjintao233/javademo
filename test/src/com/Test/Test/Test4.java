package com.Test.Test;

public class Test4 {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(gt(arr,5));
    }
    public static int gt(int[] arr,int a){
        int b = 0;
        int c = arr.length;

        while(b <= c){
            int i = (b+c)/2;
            if (a == arr[i]){
                return i;
            }else if (a > arr[i]){
                b = i + 1;
            }else if (a < arr[i]){
                c = i - 1;
            }
        }return -1;
    }
}
