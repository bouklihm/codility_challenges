import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TapeEquilibriumTest {

    @InjectMocks
    TapeEquilibrium tapeEquilibrium;

    @Test
    void solutionArraySizeTwo() {
        int[] array = {1, 2};

        Assert.assertEquals(1, tapeEquilibrium.solution(array));
    }

    @Test
    void solutionArrayCodility() {
        int[] array = {3, 1, 2, 4, 3};

        Assert.assertEquals(1, tapeEquilibrium.solution(array));
    }

    @Test
    void solutionNegatives() {
        int[] array = {-1, 1};

        Assert.assertEquals(2, tapeEquilibrium.solution(array));
    }

    @Test
    void solutionAllNegative() {
        int[] array = {-2, -3, -4, -1};

        Assert.assertEquals(0, tapeEquilibrium.solution(array));
    }

    @Test
    void solutionOnePositive() {
        int[] array = {-10, -20, -30, -40, 100};

        Assert.assertEquals(20, tapeEquilibrium.solution(array));
    }

}
