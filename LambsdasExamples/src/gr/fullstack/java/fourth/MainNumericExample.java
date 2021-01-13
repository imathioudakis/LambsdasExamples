package gr.fullstack.java.fourth;

public class MainNumericExample {

    public static void main(String[] args) {
        NumericInterface testEven = n -> n % 2 == 0;
        NumericInterface testNegative = n -> n < 0;

        System.out.println("Even number test >>> "+testEven.compute(2));
        System.out.println("Negative number test >>> "+testNegative.compute(2));
    }
}
