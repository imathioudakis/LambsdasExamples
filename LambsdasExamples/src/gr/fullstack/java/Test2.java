package gr.fullstack.java;

@FunctionalInterface
public interface Test2 {
    public String getStatus();

    default public void printStatus(){
        System.out.println("This is the status");
    }
}
