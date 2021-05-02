package race;

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
        if (engine.canMove()) {
            position.increasePosition();
        }
    }
}
