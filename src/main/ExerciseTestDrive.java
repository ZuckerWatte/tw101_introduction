package main;

import exercises.Diamond;
import exercises.Triangle;

public class ExerciseTestDrive {

    public static void main(String[] args) {
        Triangle t = new Triangle();
        Diamond d = new Diamond();

        System.out.println("\nTRIANGLE");
        System.out.println("\nsingle star: ");
        t.singleStar();

        System.out.println("\nhorizontal line: ");
        t.horizontalStars(15);

        System.out.println("\n\nvertical line: ");
        t.verticalStars(3);

        System.out.println("\n\ntriangle: ");
        t.triangleStars(3);

        System.out.println("\n\nDIAMOND");
        System.out.println("\nisosceles triangle: ");
        d.isoscelesTriangle(4);

        System.out.println("\n\ndiamond: ");
        d.diamond(9);

    }
}
