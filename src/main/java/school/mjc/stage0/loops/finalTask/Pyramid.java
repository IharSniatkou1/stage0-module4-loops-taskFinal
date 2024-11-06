package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int row = 1; row <= cathetusLength; row++) {

            for (int spaces = 1; spaces <= cathetusLength - row; spaces++) {
                System.out.print(" ");
            }

            for (int left = row; left >= 1; left--) {
                System.out.print(left);
            }

            for (int right = 2; right <= row; right++) {
                System.out.print(right);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
