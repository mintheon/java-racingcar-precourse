package race;

import java.util.HashSet;
import java.util.Set;

public class Input implements InputInterface {
    private static final String INPUT_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_ROUND = "시도할 회수는 몇회인가요?";

    public String[] names() {
        System.out.println(INPUT_NAMES);
        String[] inputNames = getSplitNames(getInput());

        return inputNames;
    }

    public int round() {
        System.out.println(INPUT_ROUND);
        int inputNumber = parseNumber(getInput());

        return inputNumber;
    }

    private String[] getSplitNames(String inputNames) {
        String[] splitNames = inputNames.split(",");

        if (isDuplicate(splitNames)) {
            throw new IllegalArgumentException("자동차 이름은 중복되지 않아야 합니다.");
        }

        return splitNames;
    }

    private boolean isDuplicate(String[] splitNames) {
        Set<String> notDuplicateNames = new HashSet<>();

        for (String splitName : splitNames) {
            notDuplicateNames.add(splitName);
        }

        return notDuplicateNames.size() != splitNames.length;
    }

    private int parseNumber(String inputNumber) {
        if(!isNumber(inputNumber)) {
            throw new IllegalArgumentException("숫자를 입력해주세요.");
        }

        return Integer.parseInt(inputNumber);
    }

    private boolean isNumber(String inputNumber) {
        return inputNumber.matches("[0-9]+$");
    }
}
