package racinggame.domain;

import org.junit.jupiter.api.Test;
import racinggame.enums.Error;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class CarNameTest {
    @Test
    public void 자동차_이름_정상길이_확인() {
        CarName carName = new CarName("theon");
        assertThat(carName.getName()).isEqualTo("theon");
    }

    @Test
    public void 자동차_이름_공백시작_확인() {
        assertThatThrownBy(() -> new CarName(" "))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Error.WRONG_CAR_NAME.message());
    }

    @Test
    public void 자동차_이름길이_초과_확인() {
        assertThatThrownBy(() -> new CarName("mintheon"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Error.WRONG_CAR_NAME.message());
    }
}