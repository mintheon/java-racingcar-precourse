import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import race.CarFactory;
import race.Cars;

public class CarsTest {
    private Cars cars;

    @BeforeAll
    public void setUp() {
        cars = new Cars(CarFactory.generateCars(Arrays.array("pobi", "crong", "honux")));
    }

    @Test
    @DisplayName("자동차 비교 테스트")
    public void car_move_compare() {
    }
}
