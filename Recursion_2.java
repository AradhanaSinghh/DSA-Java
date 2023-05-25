package com.company;

public class Recursion_2 {
    //print a string in reverse
    public static String reverse_string(String str){
        int n =str.length();
        if(n==0){
            return "";
        }
        return (str.charAt(n-1)+reverse_string(str.substring(0,n-1)));
    }
    public static void main(String[] args) {
        String str="aradhana";
        System.out.println(reverse_string(str));
    }
}
