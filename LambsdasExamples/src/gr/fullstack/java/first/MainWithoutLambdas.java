package gr.fullstack.java.first;

import java.util.Comparator;

public class MainWithoutLambdas {

    public static void main(String[] args) {
	    Comparator<Car> carComparator = new Comparator<Car>(){
            @Override
            public int compare(Car c1, Car c2) {
                return c1.getTopSpeed() - c2.getTopSpeed();
            }
        };

	    Car yugo = new Car("Yugo", "Zastava",100 );
        Car robin = new Car("Reliant", "Robin",85 );

	    int comparison = carComparator.compare(yugo, robin);
	    System.out.println(">> "+comparison);
    }
}
