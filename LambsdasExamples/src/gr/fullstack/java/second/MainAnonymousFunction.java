package gr.fullstack.java.second;

//Functional interface example
public class MainAnonymousFunction {

    public static void main(String[] args) {
        AnonymousFunction myFunction = () -> System.out.println("Hello world");

        myFunction.myMethod();
    }
}
