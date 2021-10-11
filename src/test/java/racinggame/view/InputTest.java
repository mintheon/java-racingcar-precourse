package racinggame.view;

import org.junit.jupiter.api.Test;
import racinggame.domain.CarName;
import racinggame.enums.Error;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class InputTest {

    @Test
    public void 중복_자동차_생성_확인() {
        List<CarName> carNames = new ArrayList<>();

        String[] inputNames = "pobi,crong,pobi".split(",");
        for (String inputName : inputNames) {
            carNames.add(new CarName(inputName));
        }

        assertThatThrownBy(() -> Input.duplicateCheck(carNames))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Error.DUPLICATE_CAR_NAME.message());
    }

    @Test
    void 숫자대신_문자_입력_확인() {
        assertThatThrownBy(() -> Input.parseNumber("q"))
                .isInstanceOf(NumberFormatException.class);
    }
}