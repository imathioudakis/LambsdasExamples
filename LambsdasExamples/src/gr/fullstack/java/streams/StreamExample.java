package gr.fullstack.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args){
        Integer[] numbers = { 1, 2, 3, 4, 5 };
        List<String> words = Stream.of(numbers).map(num -> Integer.toString(num) ).collect(Collectors.toList());
        List<String> filteredWords= words.stream().filter(w -> !w.equals("4")).collect(Collectors.toList());
        filteredWords.forEach(System.out::println);
        //This can also be written with a "normal" lambda expression
        filteredWords.forEach(w -> System.out.println(w));
    }
}
