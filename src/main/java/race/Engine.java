package race;

import java.util.Random;

public class Engine {
    private static final Random random = new Random();
    private static final int REF_VALUE = 4;

    public boolean canMove() {
        return random.nextInt(9) >= REF_VALUE;
    }

    public boolean canMove(int randomNumber) {
        return randomNumber >= REF_VALUE;
    }
}
