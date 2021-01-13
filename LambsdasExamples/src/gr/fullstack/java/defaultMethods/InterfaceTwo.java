package gr.fullstack.java.defaultMethods;

public interface InterfaceTwo {
    String printTwo();

    default void print(){
        System.out.println("Two");
    }
}
