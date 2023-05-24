package com.company;
public class Strings_question_2 {
    public static float getShortestPath(String path){
        //time complexity:- O(n);
        int x=0, y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir=='S'){
                y--;
            }
            else if(dir=='N'){
                y++;
            }
            else if(dir=='W'){
                x--;
            }
            else{
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);//Math-sqrt return float
    }
    public static String substring(String str,int start,int end){
        String substr="";
        for(int i=start;i<end;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String path="WNEENSENENE";
        System.out.println(getShortestPath(path));
        String s1="tony";
        String s2="tony";
        String s3=new String("tony");//new creates new String
        if(s1==s2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        if(s1==s3){
            System.out.println("string are equal");
        }
        else{
            System.out.println("not equal");
        }
        if(s1.equals(s3)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
//interning- heap and stack memory

    }
}
