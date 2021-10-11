package racinggame.domain;

public class Car implements Comparable<Car> {
    private final CarName name;
    private final Engine engine;
    private final Position position;


    public Car(CarName name, Engine engine, Position position) {
        this.name = name;
        this.engine = engine;
        this.position = position;
    }

    public String getName() {
        return name.getName();
    }

    public int getPosition() {
        return position.getPosition();
    }

    public void move() {
        if (engine.canMove()) {
            position.increase();
        }
    }

    public boolean comparePosition(Car target) {
        return this.compareTo(target) == 0;
    }

    @Override
    public int compareTo(Car target) {
        return position.compareTo(target.position);
    }
}
