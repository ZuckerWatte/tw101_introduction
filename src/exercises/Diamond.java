package exercises;

public class Diamond {

    public void isoscelesTriangle(int lines) {
        int stars = 1;
        int chars = lines*2;

        for (int line = 1; line <= chars; line++) {
            boolean oddLineNumber = line % 2 > 0;

            if (oddLineNumber) {
                int spaces = chars - stars;
                for (int s = spaces / 2; s > 0; s--) {
                    System.out.print(" ");
                }

                for (int s = stars; s > 0; s--) {
                    System.out.print("*");
                }
                stars +=2;

            } else {
                System.out.println("");
            }
        }
    }
}
