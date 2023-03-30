package com.company;
import java.util.*;
import java.io.*;
class Student implements Comparable<Student>{
    int rollno;
    String name;
    int age;

    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    @Override
    public int compareTo(Student st) {
        return this.age - st.age;
//              90      -  19 =  71
//   for increasing order
           /* if(this.age > st.age)
                return  1; //current object is larger
            else if(this.age < st.age)
                return -1; //current object is smaller
            return 0; // current object is equal*/
//for decreasing order
        /* if(this.age < st.age)
                return  1;
            else if(this.age > st.age)
                return -1;
            return 0; */

    }
}
public class Java_concepts_comparable {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<>();
        al.add(new Student(18,"shiela",90));
        al.add(new Student(28,"sheetal",19));
        al.add(new Student(38,"seema",29));
        Collections.sort(al);
        for(Student st:al){
            System.out.println(st.rollno+" "+ st.name+ " "+ st.age);
        }
   /*     al.forEach(System.out::println);*/
    }
}
