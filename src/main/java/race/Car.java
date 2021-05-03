package race;

import race.enums.CarStatus;

import java.util.Collections;

public class Car {
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

    public void move() {
        if (engine.getMoveStatus() == CarStatus.GO) {
            position.increasePosition();
        }
    }

    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCarName()).append(": ").append(String.join("", Collections.nCopies(getPosition(), "-")));

        System.out.println(sb);
    }
}
