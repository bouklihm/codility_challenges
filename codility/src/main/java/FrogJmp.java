public class FrogJmp {

    public int solution(int start, int end, int jump) {
        if(start == end) return 0;

        double jumps = (double)(end - start)/(double)jump;
        if ( jumps == Math.floor(jumps) ) return (int)jumps;
        return (int)jumps + 1;
    }

}
