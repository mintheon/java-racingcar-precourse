package racinggame.domain;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CarFactoryTest {
    private CarFactory carFactory;
    private List<CarName> carNames;

    @BeforeEach
    void setUp() {
        carFactory = new CarFactory();

        carNames = Arrays.asList("pobi,crong,honux".split(","))
                .stream()
                .map(name -> new CarName((String) name))
                .collect(Collectors.toList());
    }

    @Test
    public void 자동차들_생성_확인() {
        Cars cars = carFactory.generateCars(carNames);

        assertThat(cars.toString()).contains("pobi", "crong", "honux");
    }
}