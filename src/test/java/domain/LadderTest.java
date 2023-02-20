package domain;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class LadderTest {
    private final RandomDigitsGenerator randomDigitsGenerator = new RandomDigitsGenerator();

    @DisplayName("사다리를 생성한다.")
    @Test
    void create_ladder() {
        assertDoesNotThrow(() -> new Ladder(4, 4, randomDigitsGenerator));
    }

    @DisplayName("사다리 높이가 1이상 50이하가 아닌 경우 예외가 발생한다.")
    @ParameterizedTest
    @ValueSource(ints = {0, -1, 51})
    void invalid_height(int height) {
        assertThatThrownBy(() -> new Ladder(height, 4, randomDigitsGenerator))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("사다리 높이는 1부터 50까지 입니다.");
    }

}
