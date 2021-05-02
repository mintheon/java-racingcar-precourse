import org.junit.jupiter.api.BeforeAll;
import race.Car;

public class CarTest {
    private Car car;

    @BeforeAll
    public void setUp() {
        Car car = new Car("theon");
    }
}
