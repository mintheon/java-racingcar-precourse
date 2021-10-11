package racinggame.view;

import nextstep.utils.Console;
import racinggame.domain.CarName;
import racinggame.enums.Error;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Input {
    private static final String INPUT_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_ROUND = "시도할 회수는 몇회인가요?";

    public static List<CarName> names() {
        while (true) {
            Output.print(INPUT_NAMES);

            try {
                String[] inputNames = Console.readLine().split(",");

                List<CarName> carNames = new ArrayList<>();

                for (String inputName : inputNames) {
                    carNames.add(new CarName(inputName));
                }

                duplicateCheck(carNames);

                return carNames;
            } catch (IllegalArgumentException e) {
                Output.print(e.getMessage());
            }
        }
    }

    public static void duplicateCheck(List<CarName> names) {
        Set<CarName> validNames = new HashSet<>(names);

        if (validNames.size() != names.size()) {
            throw new IllegalArgumentException(Error.DUPLICATE_CAR_NAME.message());
        }
    }

    public static int round() {
        while (true) {
            Output.print(INPUT_ROUND);

            try {
                int inputNumber = parseNumber(Console.readLine());

                return inputNumber;
            } catch (NumberFormatException e) {
                Output.print(Error.NOT_NUMBER.message());
            }
        }
    }

    public static int parseNumber(String inputNumber) {
        return Integer.parseInt(inputNumber);
    }
}
