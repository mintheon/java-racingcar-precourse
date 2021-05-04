package race;

import race.enums.CarStatus;
import race.enums.PositionState;

import java.util.Collections;
import java.util.Random;

public class Car implements Comparable<Car> {
    private final CarName carName;
    private final Engine engine;
    private final Position position;

    public Car(String carName) {
        this.carName = new CarName(carName);
        this.engine = new Engine();
        this.position = new Position();
    }

    public String getCarName() {
        return carName.getCarName();
    }

    public int getPosition() {
        return position.getPosition();
    }

    public void move(Random random) {
        if (engine.move(random) == CarStatus.GO) {
            position.increasePosition();
        }
    }

    public PositionState comparePosition(Car target) {
        if (this.compareTo(target) > 0) {
            return PositionState.FRONT;
        }
        if (this.compareTo(target) < 0) {
            return PositionState.BEHIND;
        }

        return PositionState.SAME;
    }

    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCarName()).append(": ").append(String.join("", Collections.nCopies(getPosition(), "-")));

        System.out.println(sb);
    }

    @Override
    public int compareTo(Car target) {
        return this.position.compareTo(target.position);
    }
}
