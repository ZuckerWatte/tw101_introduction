package exercises;

public class Diamond {

    private void printPadding(int lines, int chars) {
        int max = lines * 2 - 1;
        int spaces = (max - chars)/2;
        for (int s = spaces; s > 0; s--) {
            System.out.print(" ");
        }
    }

    private void printStars(int stars) {
        for (int s = stars; s > 0; s--) {
            System.out.print("*");
        }
    }

    private void printTriangle(int stars, int lines, int s) {
        int max = lines * 2 - 1;
        for (int line = 1; line < max; line++) {
            if (line % 2 > 0) {
                printPadding(lines, stars);
                printStars(stars);
                stars += s;
            } else {
                System.out.println("");
            }
        }
    }

    private void upperHalf(int lines) {
        int stars = 1;
        int starsAdded = 2;
        printTriangle(stars, lines, starsAdded);
    }

    private void lowerHalf(int lines) {
        int stars = lines * 2 - 3;
        int starsSubtracted = -2;
        printTriangle(stars, lines, starsSubtracted);
    }

    private void middleRow(int lines) {
        int stars = lines * 2 - 1;;
        printPadding(lines, stars);
        printStars(stars);
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
        printPadding(lines, name.length());
        System.out.println(name);
        this.lowerHalf(lines);
    }
}
