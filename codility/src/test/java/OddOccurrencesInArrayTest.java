import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
class OddOccurrencesInArrayTest {

    @InjectMocks
    OddOccurrencesInArray oddOccurrencesInArray;

    @Test
    void solutionSimpleTest() {
        int[] testArray = {9,3,9,3,9,7,9};
        assertEquals(oddOccurrencesInArray.solution(testArray), 7);
    }

    @Test
    void solutionOddAtEnd() {
        int[] testArray = {9,3,9,3,9,9,7};
        assertEquals(oddOccurrencesInArray.solution(testArray), 7);
    }

    @Test
    void solutionOddAtEndCodility() {
        int[] testArray = {2, 2, 3, 3, 4};
        assertEquals(oddOccurrencesInArray.solution(testArray), 4);
    }

    @Test
    void solutionOddAtBeginning() {
        int[] testArray = {7,9,3,9,3,9,9};
        assertEquals(oddOccurrencesInArray.solution(testArray), 7);
    }

    @Test
    void solutionOddSize1() {
        int[] testArray = {7};
        assertEquals(oddOccurrencesInArray.solution(testArray), 7);
    }
}
