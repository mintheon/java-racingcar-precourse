package racinggame.domain;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CarFactoryTest {
    private CarFactory carFactory;

    @BeforeEach
    void setUp() {
        carFactory = new CarFactory();
    }

    @Test
    public void 자동차들_생성_확인() {
        Cars cars = carFactory.generateCars(Arrays.array("pobi","crong","honux"));

        assertThat(cars.toString()).contains("pobi", "crong", "honux");
    }
}