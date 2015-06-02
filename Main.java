/**
 * Created by malinmaria on 5/18/15.
 */
public class Main {

    public static void main(String args[]){

        //Problem One
        ProblemOne answerOne = new ProblemOne();
        System.out.println(answerOne.multiples());

        //Problem Three
        ProblemThree answerThree = new ProblemThree();
        System.out.println(answerThree.prime(600851475143L));

        //Problem Five
        ProblemFive answerFive = new ProblemFive();
        answerFive.smallMult();

        //Problem Six
        ProblemSix answer = new ProblemSix();
        answer.sumOfSquares();
        answer.squareOfSums();
        System.out.println(answer.squareOfSums()-answer.sumOfSquares()); //both functions must have a return type for this to work



    }
}
