package racinggame.domain;

import racinggame.enums.Error;

import java.util.NoSuchElementException;

public class CarName {
    public static final int MIN_LENGTH = 1, MAX_LENGTH = 5;

    String name;

    public CarName(String inputName) {
        String trimName = inputName.trim();

        if (trimName.length() < MIN_LENGTH || trimName.length() > MAX_LENGTH) {
            throw new NoSuchElementException(Error.WRONG_CAR_NAME.message());
        }

        this.name = trimName;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || !(o instanceof CarName)) {
            return false;
        }

        CarName target = (CarName) o;

        return name.equals(target.getName());
    }
}
