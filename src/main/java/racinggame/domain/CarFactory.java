package racinggame.domain;

import racinggame.enums.Error;

import java.util.*;

public class CarFactory {
    public static final Cars generateCars(List<CarName> inputNames) {
        if (isDuplicate(inputNames)) {
            throw new NoSuchElementException(Error.DUPLICATE_CAR_NAME.message());
        }

        List<Car> cars = new ArrayList<>();
        for (CarName name : inputNames) {
            cars.add(new Car(name, new Engine(), new Position()));
        }

        return new Cars(cars);
    }

    private static boolean isDuplicate(List<CarName> names) {
        Set<CarName> validNames = new HashSet<>(names);

        return validNames.size() != names.size();
    }
}
