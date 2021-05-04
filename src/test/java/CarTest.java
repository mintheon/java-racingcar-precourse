import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import race.Car;
import race.enums.PositionState;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    private Car pobi, crong, honux;

    @BeforeEach
    public void setUp() {
        pobi = new Car("pobi");
        crong = new Car("crong");
        honux = new Car("honux");
    }

    @Test
    @DisplayName("자동차_각_위치_비교했을_경우")
    public void car_move_compare() {
        pobi.move(createRandom(5));

        crong.move(createRandom(5));

        honux.move(createRandom(5));
        honux.move(createRandom(5));
        honux.move(createRandom(5));

        assertAll(
                () -> assertEquals(pobi.comparePosition(crong), PositionState.SAME),
                () -> assertEquals(pobi.comparePosition(honux), PositionState.BEHIND),
                () -> assertEquals(honux.comparePosition(pobi), PositionState.FRONT)
        );
    }

    private Random createRandom(int returnValue) {
        return new Random() {
            public int nextInt(int bound) {
                return returnValue;
            }

            ;
        };
    }
}
