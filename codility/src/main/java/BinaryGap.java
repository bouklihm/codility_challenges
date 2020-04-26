import java.util.ArrayList;
import java.util.List;

public class BinaryGap {

    public int solution(int number) {
        String binaryNumber = Integer.toBinaryString(number);

        if (binaryNumber.length() < 3) return 0;

        return getFindgap(binaryNumber);
    }

    private int getFindgap(String binaryNumber) {
        List<Integer> indexes = new ArrayList<>();
        int maxGap = 0;

        indexesForOnes(binaryNumber, indexes);

        return getMaxDifference(indexes, maxGap);
    }

    private int getMaxDifference(List<Integer> indexes, int maxGap) {
        for (int i = 1; i < indexes.size(); i++){
            int gapCheck = indexes.get(i) - indexes.get(i-1);
            System.out.println();
            if(gapCheck > maxGap) maxGap = gapCheck;
        }
        return Math.max(0, maxGap-1);
    }

    private void indexesForOnes(String binaryNumber, List<Integer> indexes) {
        for(int i =0; i < binaryNumber.length(); i++){
            if(binaryNumber.charAt(i) == '1'){
                indexes.add(i);
            }
        }
    }

}
