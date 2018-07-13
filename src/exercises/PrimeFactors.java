package exercises;

import java.util.ArrayList;

public class PrimeFactors {
    public ArrayList<Integer> generate(int n) {
        ArrayList<Integer> primeFactors = new ArrayList<>();

        for(int i = 2; i <= n; i++ ){
            while (n % i == 0) {
                if(!primeFactors.contains(i)) {
                    primeFactors.add(i);
                }
                n /= i;
            }
        }

        return primeFactors;
    }
}
