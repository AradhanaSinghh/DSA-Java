package com.company;

import java.util.Scanner;
public class Arrays_3_deletion {
    public static void main(String[] args) {
        int index=-1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the number: ");
        int key=sc.nextInt();
        for(int i=0; i<n;i++){
            if(arr[i]==key){
                index=i;
                break;
            }
        }
        if(index!=-1)
        {
            for(int i = index; i <n-1; i++) {//2
                arr[i] = arr[i + 1];
            }
            System.out.println("New array");
            for(int i = 0; i < n-1; i++){
                System.out.print(arr[i]+" ");
            }
        }
        else
            System.out.println("Element Not Found\n");
    }
}
