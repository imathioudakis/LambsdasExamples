package gr.fullstack.java.defaultMethods;

public interface InterfaceOne {
    void printOne();

    default void print(){
        System.out.println("One");
    }
}
