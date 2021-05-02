package race;

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

    public void printResults() {
        for (Car car : cars) {
            car.print();
        }
        System.out.println();
    }
}
