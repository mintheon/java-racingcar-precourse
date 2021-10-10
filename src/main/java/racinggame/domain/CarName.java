package racinggame.domain;

import racinggame.enums.Error;

public class CarName {
    public static final int MIN_LENGTH = 1, MAX_LENGTH = 5;

    String name;

    public CarName(String inputName) {
        String trimName = inputName.trim();

        if (trimName.length() < MIN_LENGTH || trimName.length() > MAX_LENGTH) {
            throw new IllegalArgumentException(Error.WORNG_CAR_NAME.message());
        }

        this.name = trimName;
    }

    public String getName() {
        return name;
    }
}
