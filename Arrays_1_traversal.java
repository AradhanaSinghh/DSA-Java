package com.company;

public class Arrays_1_traversal {
    public static void main(String[] args) {
        int[] arr={2,45,678,9999};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
                if(i<(arr.length-1)){
                    System.out.print(",");
                }
        }
    }
}
