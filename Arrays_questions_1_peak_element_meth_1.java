package com.company;
/*An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
Given an array arr[] of size N, Return the index of any one of its peak elements.*/
// with complexity - O(N) with space - O(1)

public class Arrays_questions_1_peak_element_meth_1 {
    static int peakElement(int[] arr, int n){
        if(n==1 || arr[0] >= arr[1])
            return 0;

        if(arr[n-1]>=arr[n-2])
            return (n-1);

        for(int i=1;i<=n-1;i++){
            if (arr[i]>=arr[i-1]&&arr[i]>=arr[i+1]) {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={1,20,3,4,20,5,7,8,6,10};
        int n= arr.length;
            System.out.println("the index of peak element is: "+ peakElement(arr,n));

    }
}
