package exercises;

public class Triangle {

    public void singleStar() {
        System.out.println("*");
    }

    public void horizontalStars(int n) {
        for(int i=0; i < n; i++) {
            System.out.print("*");
        }
    }

    public void verticalStars(int n) {
        for(int i=0; i < n; i++) {
            System.out.println("*");
        }
    }

    public void triangleStars(int n) {
        for(int i=0; i <= n; i++) {
            for(int j=i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
