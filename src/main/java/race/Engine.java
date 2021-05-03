package race;

import race.enums.CarStatus;

import java.util.Random;

public class Engine {
    private static final Random random = new Random();
    private static final int REF_VALUE = 4;

    public CarStatus getMoveStatus() {
        if (random.nextInt(9) < REF_VALUE) {
            return CarStatus.STOP;
        }

        return CarStatus.GO;
    }

    public CarStatus getMoveStatus(int randomNumber) {
        if (randomNumber < REF_VALUE) {
            return CarStatus.STOP;
        }

        return CarStatus.GO;
    }
}
