package gr.fullstack.java.fifth;

public class MainAnonymousFunctionWithDefault {

    public static void main(String[] args) {
        InterfaceWithDefaultMethods myInterface = text -> System.out.println(text);

        myInterface.printMessage("Hello World!!");

        InterfaceWithDefaultMethods.printStaticMessage("asdasdasdasd");

        myInterface.printAnotherMessage("asdasdasdasd");
    }
}
