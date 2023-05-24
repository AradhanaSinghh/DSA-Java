package com.company;
public class Strings_question_1 {
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n =str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //palindrome-reading from back or front gives same output
        //O(n)
        String str="Aradhana";
        Boolean a=isPalindrome(str);
        System.out.println(a);
    }
}
