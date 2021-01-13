package gr.fullstack.java.third;

public class MainAnotherFunction {

    public static void main(String[] args) {
        AnotherFunction myFunction = text -> System.out.println(text);

        myFunction.myMethod("Hello World!");
    }
}
