/**
 * Created by malinheineking on 5/18/15.
 */
public class ProblemSix {

    public ProblemSix() {
    }


    public int sumOfSquares() {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += (i * i);
        }
        return sum;
    }

    public int squareOfSums() {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum+=i;
        }
        return sum*sum;
    }

}
