package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {
    public static final Cars generateCars(List<CarName> inputNames) {
        List<Car> cars = new ArrayList<>();
        for (CarName name : inputNames) {
            cars.add(new Car(name, new Engine(), new Position()));
        }

        return new Cars(cars);
    }
}
