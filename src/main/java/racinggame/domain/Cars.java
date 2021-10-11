package racinggame.domain;

import java.util.Collections;
import java.util.List;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(Car car : cars) {
            sb.append(car.getName())
                    .append(": ")
                    .append(String.join("", Collections.nCopies(car.getPosition(), "-")))
                    .append("\n");
        }

        return sb.toString();
    }
}
