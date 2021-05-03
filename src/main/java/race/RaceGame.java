package race;

public class RaceGame {
    public static final Input input = new Input();

    public void start() {
        Cars cars = new Cars(CarFactory.generateCars(input.names()));
        int round = input.round();

        Race race = new Race(cars, round);
        race.play();
    }
}
