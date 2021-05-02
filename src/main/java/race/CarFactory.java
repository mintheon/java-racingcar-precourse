package race;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarFactory {

    public List<Car> generateCars(String inputNames) {
        List<Car> cars = new ArrayList<>();
        String[] names = getSplitNames(inputNames);

        for (String name : names) {
            cars.add(new Car(name));
        }

        return cars;
    }

    private String[] getSplitNames(String inputNames) {
        String[] splitNames = inputNames.split(",");

        if (isDuplicate(splitNames)) {
            throw new IllegalArgumentException("중복된 자동차 이름이 입력되었습니다.");
        }

        return splitNames;
    }

    private boolean isDuplicate(String[] splitNames) {
        Set<String> notDuplicateNames = new HashSet<>();

        for (String splitName : splitNames) {
            notDuplicateNames.add(splitName);
        }

        return notDuplicateNames.size() == splitNames.length;
    }
}
