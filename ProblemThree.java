/**
 * Created by malinmaria on 5/26/15.
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.

   What is the largest prime factor of the number 600851475143 ?
 *
 */
public class ProblemThree {

    public long prime(long number) {
        int i;
        for (i = 2; i < number; i++) {
            if (number % i == 0){
                number /= i;
                i--;
            }
        }
        return i;
    }
}


