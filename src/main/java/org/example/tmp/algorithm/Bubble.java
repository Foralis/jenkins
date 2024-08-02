package org.example.tmp.algorithm;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {7,4,1,5,33,1,5};
        int tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        for (int a: arr
             ) {
            System.out.print(a + " ");
        }
    }
}
