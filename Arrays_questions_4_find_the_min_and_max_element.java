package com.company;
import java.util.Scanner;
import java.util.Arrays;
    public class Arrays_questions_4_find_the_min_and_max_element {
        static void min_max(Long[] arr, int n ){
            Arrays.sort(arr);
            System.out.println("Minimum: " + arr[0] + " Maximum: " + arr[n-1]);

        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("N");
            int N=sc.nextInt();
            Long[] arr = new Long[N];
            for(int i=0;i<N;i++) {
                arr[i]=sc.nextLong();
            }
            int n=arr.length;
            min_max(arr,n);
        }
    }
