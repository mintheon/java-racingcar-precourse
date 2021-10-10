package racinggame.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PositionTest {
    private Position position;

    @BeforeEach
    void setUp() {
        position = new Position();
    }

    @Test
    public void 위치_증가_확인() {
        assertThat(position.getPosition()).isEqualTo(0);
        position.increase();
        assertThat(position.getPosition()).isEqualTo(1);
    }
}