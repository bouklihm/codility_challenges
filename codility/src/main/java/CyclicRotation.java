import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class CyclicRotation {

    public int[] solution(int[] arrayA, int rotations) {
        while (rotations > arrayA.length) rotations = rotations - arrayA.length;

        int[] rotated = ArrayUtils.addAll(Arrays.copyOfRange(arrayA, arrayA.length-rotations, arrayA.length),
                Arrays.copyOfRange(arrayA, 0, arrayA.length-rotations));
        return rotated;
    }

}
