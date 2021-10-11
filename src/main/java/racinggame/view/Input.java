package racinggame.view;

import nextstep.utils.Console;
import racinggame.domain.CarName;
import racinggame.enums.Error;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Input {
    private static final String INPUT_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_ROUND = "시도할 회수는 몇회인가요?";

    public static List<CarName> names() {
        System.out.println(INPUT_NAMES);

        while (true) {
            try {
                return Arrays.asList(Console.readLine().split(",")).stream()
                        .map(name -> new CarName(name))
                        .collect(Collectors.toList());

            } catch (NoSuchElementException e) {
                Output.print(e.getMessage());
            }
        }
    }

    public static int round() {
        System.out.println(INPUT_ROUND);

        while (true) {
            try {
                int inputNumber = parseNumber(Console.readLine());

                return inputNumber;
            } catch (NumberFormatException e) {
                Output.print(Error.NOT_NUMBER.message());
            }
        }
    }

    private static int parseNumber(String inputNumber) {
        return Integer.parseInt(inputNumber);
    }
}
