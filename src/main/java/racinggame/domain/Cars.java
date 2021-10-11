package racinggame.domain;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void accelerate() {
        for (Car car : cars) {
            car.move();
        }
    }

    public String getWinners() {
        Car maxPositionCar = Collections.max(cars);

        return cars.stream()
                .filter(car -> car.comparePosition(maxPositionCar))
                .map(Car::getName)
                .collect(Collectors.joining(","));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Car car : cars) {
            sb.append(car.getName())
                    .append(": ")
                    .append(String.join("", Collections.nCopies(car.getPosition(), "-")))
                    .append("\n");
        }

        return sb.toString();
    }
}
