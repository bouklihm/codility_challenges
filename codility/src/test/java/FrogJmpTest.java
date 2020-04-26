import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
class FrogJmpTest {

    @InjectMocks
    FrogJmp frogJmp;

    @Test
    void solutionFirstTest() {
        assertEquals(3, frogJmp.solution(10, 85, 30));
    }

    @Test
    void solutionSameTest() {
        assertEquals(0, frogJmp.solution(85, 85, 30));
    }

    @Test
    void solutionZeroTest() {
        assertEquals(3, frogJmp.solution(1, 85, 30));
    }

    @Test
    void solutionNotWorking() {
        assertEquals(3, frogJmp.solution(2, 11, 3));
    }


}
