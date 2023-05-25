package com.company;

public class Recursion_4 {
    public static Boolean[] map=new Boolean[26];
    public static void removeDuplicates(String str,int ind,String newStr){
        if(ind==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(ind);
        if(map[currChar-'a']){
            removeDuplicates(str,ind+1,newStr);
        }else{
            newStr+=currChar;
            map[currChar-'a']=true;
            removeDuplicates(str,ind+1,newStr);
        }
    }//O(n)
    public static void string_Subsequences(String str,int ind,String newString){
        if(ind==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(ind);
        //to be
        string_Subsequences(str,ind+1,newString+currChar);
        //or not to be
        string_Subsequences(str,ind+1,newString);
    }//O(2^n)

    public static void main(String[] args) {
        String str="abc";
//        removeDuplicates(str,0,"");
        string_Subsequences(str,0,"");
    }
}
