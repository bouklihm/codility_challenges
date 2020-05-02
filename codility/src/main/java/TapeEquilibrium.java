

import java.util.Arrays;
import java.util.stream.IntStream;

public class TapeEquilibrium {

    public int solution(int[] integerArray) {
        int minNumber = Integer.MAX_VALUE;
        if (integerArray.length<3) {
            return Math.abs(integerArray[0] - integerArray[1]);
        }


        for (int i = 1; i < integerArray.length; i++) {
            int sumFirstHalf = IntStream.of(Arrays.copyOfRange(integerArray, 0, i)).sum();
            int sumSecondHalf = IntStream.of(Arrays.copyOfRange(integerArray, i, integerArray.length)).sum();
            int minSubTemp = Math.abs(sumFirstHalf - sumSecondHalf);
            if (minNumber > minSubTemp) minNumber  = minSubTemp;
        }

        return minNumber;
    }

}
