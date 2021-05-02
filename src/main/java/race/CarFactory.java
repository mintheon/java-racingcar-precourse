package race;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    public static final List<Car> generateCars(String[] inputNames) {
        List<Car> cars = new ArrayList<>();
        String[] names = inputNames;

        for (String name : names) {
            cars.add(new Car(name));
        }

        return cars;
    }
}
