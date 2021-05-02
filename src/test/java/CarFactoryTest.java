import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import race.Car;
import race.CarFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarFactoryTest {
    private static final CarFactory carFactory = new CarFactory();

    @Test
    @DisplayName("자동차_3개_생성_할_경우")
    public void car_generate() {
        List<Car> cars = carFactory.generateCars(Arrays.array("pobi", "crong", "honux"));

        assertAll(
                () -> assertEquals(cars.size(), 3),
                () -> assertEquals(cars.get(0).getCarName(), "pobi"),
                () -> assertEquals(cars.get(1).getCarName(), "crong"),
                () -> assertEquals(cars.get(2).getCarName(), "honux")
        );
    }
}
