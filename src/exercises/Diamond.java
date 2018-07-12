package exercises;

public class Diamond {

    private void printWithPadding(int chars, int stars) {
        int spaces = chars - stars;
        for (int s = spaces / 2; s > 0; s--) {
            System.out.print(" ");
        }

        for (int s = stars; s > 0; s--) {
            System.out.print("*");
        }
    }

    private void upperHalf(int lines) {
        int chars = lines*2 - 1;
        int stars = 1;

        for (int line = 1; line < chars; line++) {
            if (line % 2 > 0) {
                printWithPadding(chars, stars);
                stars += 2;

            } else {
                System.out.println("");
            }
        }
    }

    private void lowerHalf(int lines) {
        int chars = lines*2 - 1;
        int stars = chars;

        for (int line = chars; line >= 0; line--) {
            if (line % 2 > 0) {
                stars -= 2;
                printWithPadding(chars, stars);

            } else {
                System.out.println("");
            }
        }
    }

    private void middleRow(int lines) {
        int chars = lines*2 - 1;
        int maxStars = chars;
        printWithPadding(chars, maxStars);
        System.out.println("");
    }


    public void isoscelesTriangle(int lines) {
        this.upperHalf(lines);
        this.middleRow(lines);

    }

    public void diamond(int lines) {
        this.upperHalf(lines);
        this.middleRow(lines);
        this.lowerHalf(lines);

    }
}
