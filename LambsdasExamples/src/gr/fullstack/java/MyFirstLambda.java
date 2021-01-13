package gr.fullstack.java;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyFirstLambda {
    public static void main(String[] args){
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5); //{1,2,3};

        for(int i=0; i<integers.size(); i++){
            System.out.println(integers.get(i));
        }
        System.out.println("********* With an iterator *********");
        Iterator<Integer> it = integers.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("********* With a for each *********");
        for(Integer x: integers){
            System.out.println(x);
        }
        System.out.println("******** With a lambda expression **********");

        integers.forEach(x -> System.out.println(x));

        System.out.println("******** With method reference using the double colon operator **********");

        integers.forEach(System.out :: println);
        integers.stream().map(x -> x+1).forEach(System.out :: println);

        List<Integer> filteredWords= integers.stream().filter(x -> x%2==0).collect(Collectors.toList());
        filteredWords.forEach(System.out::println);

    }
}
