package gr.fullstack.java.sixth;

public class MainGFIstring {

    public static void main(String[] args) {

        //String version of GenericFunctionalInterface
        GenericFunctionalInterface<String> reverseString = str -> new StringBuilder(str).reverse().toString();

        System.out.println("Running with String >>> "+reverseString.run("This is a test sentence."));
    }
}
