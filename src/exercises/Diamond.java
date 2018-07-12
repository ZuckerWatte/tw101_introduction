package exercises;

public class Diamond {

    private void printWithPadding(int positions, int chars) {

        int spaces = positions - chars;
        for (int s = spaces / 2; s > 0; s--) {
            System.out.print(" ");
        }
    }

    private void printStars(int positions, int stars) {

        printWithPadding(positions, stars);
        for (int s = stars; s > 0; s--) {
            System.out.print("*");
        }
    }

    private void upperHalf(int lines) {
        int positions = lines*2 - 1;
        int stars = 1;

        for (int line = 1; line < positions; line++) {
            if (line % 2 > 0) {
                printStars(positions, stars);
                stars += 2;

            } else {
                System.out.println("");
            }
        }
    }

    private void lowerHalf(int lines) {
        int positions = lines*2 - 1;
        int stars = positions;

        for (int line = positions; line >= 0; line--) {
            if (line % 2 > 0) {
                stars -= 2;
                printStars(positions, stars);

            } else {
                System.out.println("");
            }
        }
    }

    private void middleRow(int lines) {
        int positions = lines*2 - 1;
        int maxStars = positions;
        printStars(positions, maxStars);
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

    public void diamondName(int lines, String name) {
        this.upperHalf(lines);
        int positions = lines*2 - 1;
        printWithPadding(positions, name.length());
        System.out.println(name);
        this.lowerHalf(lines);

    }
}
