package com.company;

import java.util.Scanner;
//time complexity- O(n^2)
public class Sorting_1_bubble_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //bubble sort
        for(int i=0;i<n-1;i++){
            for(int j=0; j<n-i-1;j++){
                int temp;
                //swap
                if(arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
