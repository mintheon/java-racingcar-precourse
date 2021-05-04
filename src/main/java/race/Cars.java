package race;

import race.enums.PositionState;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void accelerate() {
        for (Car car : cars) {
            car.move();
        }
    }

    public List<Car> getWinners() {
        List<Car> winners = new ArrayList<>();
        Car maxPositionCar = Collections.max(cars);

        for (Car car : cars) {
            if (car.comparePosition(maxPositionCar) == PositionState.SAME) {
                winners.add(car);
            }
        }

        return winners;
    }

    public void printResults() {
        for (Car car : cars) {
            car.print();
        }
        System.out.println();
    }
}
