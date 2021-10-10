package racinggame.domain;

import nextstep.utils.Randoms;
import racinggame.enums.Error;

public class Engine {
    private static final int MIN_VALUE = 0, MAX_VALUE = 9;
    private static final int STD_VALUE = 4;

    public boolean canMove() {
        return Randoms.pickNumberInRange(MIN_VALUE, MAX_VALUE) >= STD_VALUE;
    }

    public boolean canMove(int randomNumber) {
        if (isNotInRange(randomNumber)) {
            throw new IllegalArgumentException(Error.WRONG_RANDOM_NUMBER.message());
        }

        return randomNumber >= STD_VALUE;
    }

    public boolean isNotInRange(int number) {
        return number < MIN_VALUE || number > MAX_VALUE;
    }
}
