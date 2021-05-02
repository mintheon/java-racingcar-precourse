import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import race.Position;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositionTest {
    private Position position;

    @BeforeEach
    public void setUp() {
        position = new Position();
    }

    @Test
    @DisplayName("자동차가_전진했을_때_포지션_증가할_경우")
    public void car_move_position() {
        assertEquals(position.getPosition(), 0);
        position.increasePosition();
        assertEquals(position.getPosition(), 1);
    }
}
