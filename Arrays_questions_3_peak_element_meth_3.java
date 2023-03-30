package com.company;
//time complex. -O(Log N)
//space complex.- O(1)
public class Arrays_questions_3_peak_element_meth_3 {
   static int findPeak(int[] arr,int n){
           int s=0;
           int end=n-1;
           while(s<end) {
               int mid = (s + end) / 2;
               System.out.print(s + " ");
               System.out.print(end + " ");
               System.out.print(mid);
               System.out.println();
               if (arr[mid] > arr[mid + 1]) {
                   end = mid;
               } else {
                   s = mid + 1;
               }
           }
           return end;
   }

    public static void main(String[] args) {
       int[] arr={1,2,3,4,5,70,7};
       int n=arr.length;
        System.out.println("the index of a peek element is: "+findPeak(arr,n));

    }
}
