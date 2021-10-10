package racinggame.enums;

public enum Error {
    WRONG_RANDOM_NUMBER("잘못된 랜덤 숫자가 생성되었습니다."),
    WORNG_CAR_NAME("자동차의 이름은 1자 이상 5자 미만이어야 합니다."),
    DUPLICATE_CAR_NAME("중복된 자동차 이름은 사용할 수 없습니다.");

    String message;

    Error(String message) {
        String header = "[ERROR]";

        this.message = header + message;
    }

    public String message() {
        return message;
    }
}
