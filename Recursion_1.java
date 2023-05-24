package com.company;

public class Recursion_1 {
    public static void printNumb(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumb(n-1);
    }
    public static void printnumb1(int n){
        if(n==6){
            return;
        }
        else{
            printnumb1(n+1);
        }
    }
    public static int sumNaturalNumber(int n){
        if(n==0){
            return 0;
        }
           return n+sumNaturalNumber(n-1);
    }
    public static int factorial(int n){
        if(n==1||n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        //print 5 to 1
        int n=5;
        int res=factorial(n);
        System.out.println(res);
    }
}
