package race;

public class CarName {
    public static final int MIN_LENGTH = 1;
    public static final int MAX_LENGTH = 5;

    String carName;

    public CarName(String carName) {
        if(carName.length() < MIN_LENGTH || carName.length() > MAX_LENGTH ) {
            throw new IllegalArgumentException("자동차의 이름은 1자 이상 5자 미만이어야 합니다.");
        }

        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }
}
