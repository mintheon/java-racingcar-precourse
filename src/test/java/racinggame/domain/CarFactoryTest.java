package racinggame.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CarFactoryTest {

    @Test
    public void 자동차들_생성_확인() {
        List<CarName> carNames = new ArrayList<>();

        String[] inputNames = "pobi,crong,honux".split(",");
        for (String inputName : inputNames) {
            carNames.add(new CarName(inputName));
        }

        Cars cars = CarFactory.generateCars(carNames);

        assertThat(cars.toString()).contains("pobi", "crong", "honux");
    }
}