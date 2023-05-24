package com.company;
import java.util.Locale;
public class Strings_question_3 {
    public static String Convert_upper(String val){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(val.charAt(0));
        sb.append(ch);
        for(int i=1;i<val.length();i++){
            if(val.charAt(i)==' ' && i<val.length()-1){
                sb.append(val.charAt(i));
                i++;
                sb.append(Character.toUpperCase(val.charAt(i)));
            }else{
                sb.append(val.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="hi, i am aradhana";//O(n)
        System.out.println(Convert_upper(str));
    }
}
