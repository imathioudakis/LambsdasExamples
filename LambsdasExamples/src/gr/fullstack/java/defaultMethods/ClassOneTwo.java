package gr.fullstack.java.defaultMethods;

public class ClassOneTwo implements InterfaceOne, InterfaceTwo {
    @Override
    public void printOne() {
        System.out.println("One");
    }

    @Override
    public void print() {
        InterfaceOne.super.print();
        InterfaceTwo.super.print();
    }

    @Override
    public String printTwo() {
        return "Two";
    }
}
