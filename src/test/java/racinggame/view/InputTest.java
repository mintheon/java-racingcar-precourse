package racinggame.view;

import org.junit.jupiter.api.Test;
import racinggame.domain.CarName;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class InputTest {

    @Test
    public void 중복_자동차_생성_확인() {
        List<CarName> carNames = Arrays.asList("pobi,crong,pobi".split(","))
                .stream()
                .map(name -> new CarName((String) name))
                .collect(Collectors.toList());

        assertThatThrownBy(() -> Input.duplicateCheck(carNames))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]");
    }

    @Test
    void 숫자대신_문자_입력_확인() {
        assertThatThrownBy(() -> Input.parseNumber("q"))
                .isInstanceOf(NumberFormatException.class);
    }
}