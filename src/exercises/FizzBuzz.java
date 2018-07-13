package exercises;

public class FizzBuzz {
    private static final Integer FIZZ = 3;
    private static final Integer BUZZ = 5;
    private static final Integer COUNT = 100;

    public void fizzbuzz() {
        for (int i = 1; i <= COUNT; i++) {

            if (i % FIZZ == 0) {
                System.out.print("Fizz");
            }
            if (i % BUZZ == 0) {
                System.out.print("Buzz");
            }
            if ((i % FIZZ > 0) && (i % BUZZ > 0)) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
