package com.company;
import java.util.stream.*;
import java.util.*;

public class Java_concepts_streams {
    public static void main(String[] args) {
        List<Integer> l=Arrays.asList(2,3,4,5);
        List<Integer> square =l.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(square);
        Object[] s=l.toArray();
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
        }
        System.out.println();
        List<String> res=Arrays.asList("Reflection","Collection","Stream");
        List<String> res1=res.stream().filter(s1->s1.startsWith("S")).collect(Collectors.toList());
        System.out.println(res1);

        List<String> show =
                res.stream().sorted().collect(Collectors.toList());
        System.out.println(show); //works wth capital letters

        List<Integer> numbers = Arrays.asList(2,3,4,7,2);

        // collect method returns a set
        Set<Integer> squareSet =
                numbers.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println(squareSet);

        numbers.stream().map(x->x*x).forEach(y->System.out.println(y));

        int even =
                numbers.stream().filter(x->x%2!=0).reduce(0,(ans,i)-> ans+i);

        System.out.println(even);
    }
}
