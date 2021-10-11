package racinggame.domain;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class CarFactoryTest {

    @Test
    public void 자동차들_생성_확인() {
        List<CarName> carNames = Arrays.asList("pobi,crong,honux".split(","))
                .stream()
                .map(name -> new CarName((String) name))
                .collect(Collectors.toList());

        Cars cars = CarFactory.generateCars(carNames);

        assertThat(cars.toString()).contains("pobi", "crong", "honux");
    }

    @Test
    public void 중복_자동차_생성_확인() {
        List<CarName> carNames = Arrays.asList("pobi,crong,pobi".split(","))
                .stream()
                .map(name -> new CarName((String) name))
                .collect(Collectors.toList());

        assertThatThrownBy(() -> CarFactory.generateCars(carNames))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]");
    }
}