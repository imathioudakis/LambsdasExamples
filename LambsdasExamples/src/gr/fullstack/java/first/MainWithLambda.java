package gr.fullstack.java.first;

import java.util.Comparator;

public class MainWithLambda {


    public static void main(String[] args) {

        Comparator<Car> carComparator = (Car c1, Car c2) -> {
            return c1.getTopSpeed() - c2.getTopSpeed();
        };

        //Single statement Lambda expressions can be shorter
        Comparator<Car> carComparator2 = (Car c1, Car c2) -> c1.getTopSpeed() - c2.getTopSpeed();

        // We can be explicit with the Data types
        Comparator<Car> carComparator3 = (c1, c2) -> c1.getTopSpeed() - c2.getTopSpeed();

        Car yugo = new Car("Yugo", "Zastava", 100);
        Car robin = new Car("Reliant", "Robin", 85);

        int comparison = carComparator3.compare(yugo, robin);
        System.out.println(">> " + comparison);
    }
}
