import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import race.Engine;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EngineTest {
    private Engine engine;

    @BeforeEach
    public void setUp() {
        engine = new Engine();
    }

    @ParameterizedTest(name = "자동차가_전진할_수_있는_경우 - {index}: {0}")
    @ValueSource(ints = {4, 9})
    public void engine_can_move(int randomNumber) {
        assertTrue(engine.canMove(randomNumber));
    }

    @ParameterizedTest(name = "자동차가_전진할_수_없는_경우 - {index}: {0}")
    @ValueSource(ints = {0, 3})
    public void engine_cant_move(int randomNumber) {
        assertFalse(engine.canMove(randomNumber));
    }
}
