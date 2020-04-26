import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class BinaryGapTest {

    @InjectMocks
    BinaryGap binaryGap;

    @Test
    void solutionFor9() {
        int maxGap = binaryGap.solution(9);
        assertEquals(maxGap, 2);
    }

    @Test
    void solutionFor1041() {
        int maxGap = binaryGap.solution(1041);
        assertEquals(maxGap, 5);
    }

    @Test
    void solutionFor32() {
        int maxGap = binaryGap.solution(32);
        assertEquals(maxGap, 0);
    }

    @Test
    void solutionForMAX() {
        int maxGap = binaryGap.solution(2147483647);
        assertEquals(maxGap, 0);
    }

    @Test
    void solutionForMAXMinus1() {
        int maxGap = binaryGap.solution(2147483640);
        assertEquals(maxGap, 0);
    }
}
