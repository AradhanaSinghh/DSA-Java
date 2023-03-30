package com.company;
import java.util.HashSet;
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> hashset=new HashSet<>();
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            hashset.add(sc.nextInt());
        }
        System.out.println(hashset);
        for(int elements:hashset){
            count++;
        }
        System.out.println(count);
    }
}
