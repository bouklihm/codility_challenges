import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class CyclicRotationTest {

    @InjectMocks
    CyclicRotation cyclicRotation;

    @Test
    void solutionRotation3() {
        int[] arrayA = {3, 8, 9, 7, 6};
        int[] rotated = cyclicRotation.solution(arrayA, 3);
        int[] expected = {9, 7, 6, 3, 8};

        assertArrayEquals(rotated, expected);
    }

    @Test
    void solutionRotationZeros() {
        int[] arrayA = {0, 0, 0};
        int[] rotated = cyclicRotation.solution(arrayA, 1);
        int[] expected = {0, 0, 0};

        assertArrayEquals(rotated, expected);
    }

    @Test
    void solutionRotationSameSize() {
        int[] arrayA = {1, 2, 3, 4};
        int[] rotated = cyclicRotation.solution(arrayA, 4);
        int[] expected = {1, 2, 3, 4};

        assertArrayEquals(rotated, expected);
    }

    @Test
    void solutionRotationBigRotation() {
        int[] arrayA = {1, 2, 3, 4};
        int[] rotated = cyclicRotation.solution(arrayA, 25);
        int[] expected = {4, 1, 2, 3};

        assertArrayEquals(rotated, expected);
    }

    @Test
    void solutionRotationArraySize1() {
        int[] arrayA = {1};
        int[] rotated = cyclicRotation.solution(arrayA, 25);
        int[] expected = {1};

        assertArrayEquals(rotated, expected);
    }
}
