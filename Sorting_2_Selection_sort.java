package com.company;

import java.util.Scanner;
//time complexity- O(n^2)
public class Sorting_2_Selection_sort {
    static void swap(int[] arr,int smallest,int i){
        int temp;
        temp=arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //selection sort
        for(int i=0;i<n-1;i++){
            int smallest=i;
            System.out.print(smallest);
            for(int j=i+1; j<n;j++){
                if(arr[j]<arr[smallest]){
                    smallest=j;
                }

                if(smallest!=i){
                    swap(arr,smallest,i);

                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
