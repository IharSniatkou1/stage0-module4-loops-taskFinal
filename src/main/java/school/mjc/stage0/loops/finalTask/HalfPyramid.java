package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int row = 1; row <= cathetusLength; row++) {

            for (int spaces = 1; spaces <= cathetusLength - row; spaces++) {
                System.out.print(" ");
            }

            for (int stars = 1; stars <= row; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
