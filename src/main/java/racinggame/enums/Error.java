package racinggame.enums;

public enum Error {
    WRONG_RANDOM_NUMBER("잘못된 랜덤 숫자가 생성되었습니다.");

    String message;

    Error(String message) {
        String header = "[ERROR]";

        this.message = header + message;
    }

    public String message() {
        return message;
    }
}
