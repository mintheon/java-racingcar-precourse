package racinggame.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racinggame.enums.Error;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class EngineTest {
    private Engine engine;

    @BeforeEach
    void setUp() {
        engine = new Engine();
    }

    @ParameterizedTest(name = "자동차_전진_가능_확인_{index} : {0}")
    @ValueSource(ints = {4, 9})
    public void 자동차가_전진할_수_있는_경우(int randomNumber) {
        assertThat(engine.canMove(randomNumber)).isTrue();
    }

    @ParameterizedTest(name = "자동차_전진_불가능_확인_{index} : {0}")
    @ValueSource(ints = {0, 3})
    public void 자동차가_전진할_수_없는_경우(int randomNumber) {
        assertThat(engine.canMove(randomNumber)).isFalse();
    }

    @ParameterizedTest(name = "범위_외의_숫자_확인_{index} : {0}")
    @ValueSource(ints = {-1, -10, 10, 25})
    public void 범위_외의_숫자_확인(int randomNumber) {
        assertThatThrownBy(() -> engine.canMove(randomNumber))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Error.WRONG_RANDOM_NUMBER.message());
    }
}
