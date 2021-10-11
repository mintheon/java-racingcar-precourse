package racinggame.view;

import racinggame.domain.Cars;

public class Output {
    public static void printResult(Cars cars) {
        System.out.println(cars.toString());
    }

    public static void print(String message) {
        System.out.println(message);
    }
}
