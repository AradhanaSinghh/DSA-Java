package com.company;

class A {
    public int i;
}
public class Main {

    public static void main(String args[]) {
        A a1 = new A();
        A a2 = new A();
        a1.i = 10;
        a2.i = 10;
        System.out.println(a1.equals(a2));
    }

}
