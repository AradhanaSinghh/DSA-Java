package com.company;
import java.util.Arrays;
public class Arrays_6_merging {
    public static void main(String[] args) {
        int[] a={2,3,4};
        int[] b={5,6,9,7};

        int a1= a.length;
        int b1=b.length;
        int res=a1+b1;
        int[] merge=new int[res];
        for(int i=0;i<a.length;i++){
           merge[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
           merge[a.length+i]=b[i];
        }


        Arrays.sort(merge);
        for(int i=0;i<merge.length;i++){
            System.out.print(merge[i]+ " ");
        }
    }
}
