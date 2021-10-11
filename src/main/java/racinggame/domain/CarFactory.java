package racinggame.domain;

import racinggame.enums.Error;

import java.util.*;

public class CarFactory {
    public Cars generateCars(String[] inputNames) {
        if (isDuplicate(inputNames)) {
            throw new IllegalArgumentException(Error.DUPLICATE_CAR_NAME.message());
        }

        List<Car> cars = new ArrayList<>();
        for (String name : inputNames) {
            cars.add(new Car(new CarName(name), new Engine(), new Position()));
        }

        return new Cars(cars);
    }

    private boolean isDuplicate(String[] inputNames) {
        Set<String> names = new HashSet<>(Arrays.asList(inputNames));

        return names.size() != inputNames.length;
    }
}
