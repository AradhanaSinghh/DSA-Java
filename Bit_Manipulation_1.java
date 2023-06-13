package com.company;
public class Bit_Manipulation_1 {
    public static void Bit_Manipulation(int num,int i){
        int mask=(1<<(i-1));//get
        Boolean bit=(num&mask)!=0;
        if(bit==true){
            System.out.print(1+" ");
        }else{
            System.out.print(0+" ");
        }
        num=num|(1<<(i-1));//set
        System.out.print(num+" ");
        num=num& ~(1<<(i-1));//clear
        System.out.print(num+" ");
    }
    //Function to check if Kth bit is set or not.
    public static boolean checkKth(int num,int k){
        int mask=(1<<k);
        if((num&mask)!=0) {
            return true;
        }
        return false;
    }
    static String oddEven(int N){
        // code here
        if(N==0){
            return "even";
        }
        if(N==1){
            return "odd";
        }
        if((N&1)==0){
            System.out.println(Integer.toBinaryString(N&1));
            return "even";
        } return "odd";
    }
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        // Your code here
        if (n <= 0) {
            return false;
        }
        // A power of 2 will have only one bit set, so N & (N - 1) should be 0.
        if ((n & (n - 1)) == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Bit_Manipulation(70,3);
        System.out.println(oddEven(10));
    }
}
