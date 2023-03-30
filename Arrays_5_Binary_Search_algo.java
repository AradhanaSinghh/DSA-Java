package com.company;

import java.util.Arrays;

public class Arrays_5_Binary_Search_algo {
    public static void BinarySearch(int arr[],int first_Key,int last,int key) {
        Arrays.sort(arr);
        int mid = (first_Key + last) / 2;
        System.out.println(arr[mid]);
        while (first_Key <= last) {
            if (arr[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                break;

            } else if (arr[mid] < key) {
                first_Key = mid + 1;
            } else {
                last = mid - 1;
            }
            mid = (first_Key + last)/2;
        }
        if ( first_Key > last ){
            System.out.println("Element is not found!");
        }
    }
    public static void main(String[] args) {
        int arr[]={51,1,2,3,4,5,26,69,64};
        int key=51;
        int last=arr.length-1;
        BinarySearch(arr,0,last,key);

        //Second way:-

        int arr2[]={100,2,6,56,96};
        Arrays.sort(arr2);
        int key1=56;
        int res=Arrays.binarySearch(arr2,key1);
        if (res < 0)
            System.out.println("Element is not found!");
        else
            System.out.println("Element is found at index: "+res);
    }
}
