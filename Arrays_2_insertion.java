package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays_2_insertion {
    static void insert_sort(int[] arr1, int n1) {
        for(int i = 1; i < n1; i++) {
            int j = i - 1;
            int temp = arr1[i];
            while (j >= 0 && arr1[j] > temp) {
                arr1[j + 1] = arr1[j];
                j--;
            }
            arr1[j + 1] = temp;
        }
    }
        public static void main (String[]args){
            int element, pos, i, n;

            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            int[] arr = new int[n + 1];
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            element = sc.nextInt();//100
            pos = sc.nextInt();//2
            n++;//6
            System.out.println(n);
            if (pos <= n && pos >= 0) { //2
                for (i = n - 1; i >= pos; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[pos - 1] = element;
                for (i = 0; i < n; i++) {
                    insert_sort(arr,n);
                    System.out.print(arr[i] + " ");
                }
            } else {
                System.out.println("Invalid position");
            }

        }
    }

