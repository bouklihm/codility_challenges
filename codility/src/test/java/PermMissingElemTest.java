import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PermMissingElemTest {

    @InjectMocks
    PermMissingElem permMissingElem;

    @Test
    void solutionCodilityTest() {
        int[] arrayA = {1, 2, 3, 5};
        permMissingElem.solution(arrayA);

        Assert.assertEquals(4, permMissingElem.solution(arrayA));

    }

    @Test
    void solutionEmptyArrayTest() {
        int[] arrayA = {};
        permMissingElem.solution(arrayA);

        Assert.assertEquals(1, permMissingElem.solution(arrayA));

    }

    @Test
    void solutionMissingNumberAtTheEndTest() {
        int[] arrayA = {1};
        permMissingElem.solution(arrayA);

        Assert.assertEquals(2, permMissingElem.solution(arrayA));

    }

    @Test
    void solution2ElementsNotMissingTest() {
        int[] arrayA = {1,2};
        permMissingElem.solution(arrayA);

        Assert.assertEquals(3, permMissingElem.solution(arrayA));

    }
}
