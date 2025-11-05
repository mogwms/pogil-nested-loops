
public class NumberGrid {

    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= 5; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= 5; column++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= 5; column++) {
                if (column % 2 == 0) {
                    System.out.print(column + " ");
                }
            }
            System.out.println();
        }
    }
}
