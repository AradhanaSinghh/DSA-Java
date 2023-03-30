package com.company;
import java.util.Scanner;

public class Arrays_4_Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag=0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                flag=1;
            }
        }
        if(flag==1){
            System.out.println("element "+ key +" is present in the array");
        }
        else{
            System.out.println("Not founded..");
        }
    }
}
