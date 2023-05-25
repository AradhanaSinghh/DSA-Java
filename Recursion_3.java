package com.company;

public class Recursion_3 {
    //first and last occurence of an element
    static int first=-1;
    static int last=-1;
    public static void Occurence(String str,int idx,char element){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current_element=str.charAt(idx);
        if(current_element==element){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        Occurence(str,idx+1,element);
    }
    //check if an array is sorted (strictly increasing[means no duplication])
    public static Boolean isSorted(int[] arr,int ind){
        if(ind==arr.length-1){
            return true;
        }
        if(arr[ind]<arr[ind+1]){
            return false;
        }
        return isSorted(arr,ind+1);
    }//O(n)
    //move all 'x' to the end of the string
        public static String moveX(String str) {
            if (str.length() <= 1) {
                return str;
            }
            char firstChar = str.charAt(0);
            String remainingString = str.substring(1);
            if (firstChar == 'x') {
                return moveX(remainingString) + firstChar;
            } else {
                return firstChar + moveX(remainingString);
            }
        }//o(n)
    public static void main(String[] args) {
        String str="abaacadfghao";
        String str1="axbcxxd";
        Occurence(str,0,'a');
        System.out.println(moveX(str1));
    }
}
