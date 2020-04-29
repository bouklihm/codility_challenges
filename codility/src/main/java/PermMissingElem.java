import java.util.Arrays;

public class PermMissingElem {

    public int solution(int[] numberArray) {
        Arrays.sort(numberArray);
        if(numberArray.length < 1 || numberArray[0] != 1) return 1;
        int missingNumber= numberArray[0]+1;
        for (int i=0; i < numberArray.length-1; i++){
            if(numberArray[i] + 1 != numberArray [i+1]) return numberArray[i] + 1;
            missingNumber = numberArray[i+1]+1;
        }
        return missingNumber;
    }

}
