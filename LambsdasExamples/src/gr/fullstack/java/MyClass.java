package gr.fullstack.java;

import java.util.Arrays;
import java.util.List;

public class MyClass implements Test, Test2 {
    @Override
    public String getStatus() {
        return null;
    }

    @Override
    public void printStatus() {
        List<Integer> intSeq = Arrays.asList(1,2,3);
        intSeq.forEach(x -> {x += 2;System.out.println(x);});

    }

    public static void main(String [] arfs){
        MyClass a=new MyClass();
        a.printStatus();
    }
}
