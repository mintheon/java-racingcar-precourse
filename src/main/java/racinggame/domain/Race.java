package racinggame.domain;

import racinggame.view.Output;

public class Race {
    private final Cars cars;
    private final int round;

    public Race(Cars cars, int round) {
        this.cars = cars;
        this.round = round;
    }

    public void play() {
        System.out.println("\n실행결과");

        for (int i = 0; i < round; i++) {
            staging();
        }

        Output.printWinner(cars);
    }

    public void staging() {
        cars.accelerate();
        Output.printResult(cars);
    }


}
