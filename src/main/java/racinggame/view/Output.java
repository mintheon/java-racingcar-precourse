package racinggame.view;

import racinggame.domain.Cars;

public class Output {
    public static void printResult(Cars cars) {
        System.out.println(cars.toString());
    }

    public static void printWinner(Cars cars) {
        System.out.println(String.format("최종 우승자는 %s 입니다.", cars.getWinners()));
    }

    public static void print(String message) {
        System.out.println(message);
    }
}
