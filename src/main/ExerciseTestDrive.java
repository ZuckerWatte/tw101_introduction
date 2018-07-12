package main;

import exercises.Triangle;

public class ExerciseTestDrive {

    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println("single star: ");
        t.singleStar();

        System.out.println("\nhorizontal line: ");
        t.horizontalStars(8);

        System.out.println("\n\nvertical line: ");
        t.verticalStars(3);

        System.out.println("\n\ntriangle: ");
        t.triangleStars(3);



    }
}
