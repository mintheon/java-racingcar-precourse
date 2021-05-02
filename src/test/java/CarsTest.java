import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeAll;
import race.CarFactory;
import race.Cars;

public class CarsTest {
    private Cars cars;

    @BeforeAll
    public void setUp() {
        cars = new Cars(CarFactory.generateCars(Arrays.array("pobi", "crong", "honux")));
    }
}
