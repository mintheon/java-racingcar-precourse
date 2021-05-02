import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import race.CarName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarNameTest {

    @Test
    @DisplayName("자동차_이름이_범위에_맞을_경우")
    public void car_name_one_to_five() {
        CarName carName = new CarName("theon");
        assertEquals(carName.getCarName(), "theon");
    }

    @Test
    @DisplayName("자동차_이름이_공백일_경우")
    public void car_name_empty() {
        assertThrows(IllegalArgumentException.class, () -> {
            new CarName("");
        });
    }

    @Test
    @DisplayName("자동차_이름이_5자_이상의_경우")
    public void car_name_more_than_five() {
        assertThrows(IllegalArgumentException.class, () -> {
           new CarName("mintheon");
        });
    }
}
