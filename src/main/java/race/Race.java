package race;

public class Race {
    private final Cars cars;
    private final int round;

    public Race(Cars cars, int round) {
        this.cars = cars;
        this.round = round;
    }

    public void play() {
        System.out.println("실행결과");

        for (int i = 0; i < round; i++) {
            staging();
        }

        printWinner();
    }

    private void staging() {
        cars.accelerate();
        cars.printResults();
    }

    public void printWinner() {
        StringBuilder sb = new StringBuilder();

        for (Car car : cars.getWinners()) {
            sb.append(car.getCarName()).append(",");
        }

        sb.deleteCharAt(sb.length() - 1);
        sb.append("가 최종 우승했습니다.");

        System.out.println(sb.toString());
    }
}
