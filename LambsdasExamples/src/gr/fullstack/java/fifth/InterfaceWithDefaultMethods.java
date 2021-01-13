package gr.fullstack.java.fifth;

@FunctionalInterface
public interface InterfaceWithDefaultMethods {
    void printMessage(String text);

    default void printAnotherMessage(String text){
        System.out.println("This is from the default method: "+text);
    }

    static void printStaticMessage(String text){
        System.out.println("This is from the static method: "+text);
    }
}
