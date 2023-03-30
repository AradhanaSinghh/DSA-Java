package com.company;

import java.util.Scanner;
//time complexity= O(N)
//space complexity=O(1)
public class Arrays_questions_6_meth_3 {
    static void reverse_prob(int[] arr, int start, int end, int n){
        int temp;
        while(start<end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void revert(int[] arr,int n){
        for (int i = 0; i <n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        for(int i=0;i<testcases;i++){
            int n=sc.nextInt();
            int[] arr=new int[n];
           for(int j=0;j<n;j++){
               arr[j]=sc.nextInt();
           }
            reverse_prob(arr,0,n-1,n);
            System.out.println("reverse: ");
            revert(arr,n);
        }

    }
}
