package com.company;
import java.util.Scanner;
public class Arrays_questions_4_reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int i = 0; i<testCases; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0; j<n; j++){
                arr[j] = sc.nextInt();
            }
            for(int j=n-1; j>-1; j--){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
}
