package com.company;
import java.util.Scanner;

public class Arrays_questions_5_meth_2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n-- > 0){
            String str=sc.nextLine();
            System.out.println(reverse_string(str));
        }
    }

    static  String reverse_string(String str){
        int n=str.length();
        if(n==0){
            return "";

        }
        return(str.charAt(n-1)+ reverse_string(str.substring(0,n-1)));
    }
}
