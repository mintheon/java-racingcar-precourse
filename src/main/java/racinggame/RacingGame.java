package racinggame;

import racinggame.domain.CarFactory;
import racinggame.domain.Cars;
import racinggame.domain.Race;
import racinggame.view.Input;

public class RacingGame {

    public void start() {
        Cars cars = CarFactory.generateCars(Input.names());
        int round = Input.round();

        Race race = new Race(cars, round);
        race.play();
    }
}
