import java.util.Arrays;

public class OddOccurrencesInArray {

    public int solution(int[] numbersA){
        Arrays.sort(numbersA);
        if (numbersA.length < 2) return numbersA[0];
        int theOddOne = numbersA[numbersA.length-1];
        for (int i = 0; i < numbersA.length-1; i++){
            if(numbersA[i] == numbersA[i+1]) {
                i++;
                continue;
            }
            theOddOne = numbersA[i];
            break;
        }
        return theOddOne;
    }

}
