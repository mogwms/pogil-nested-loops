import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tableSize;

        System.out.println("Enter Table Size");
        tableSize = input.nextInt();

        for (int c = 1; c <= tableSize; c++) {
            System.out.printf("%4d", c);
        }
        System.out.println(" ");
        for (int row = 1; row <= tableSize; row++) {
            System.out.printf("%2d", row);
         
            for (int column = 1; column <= tableSize; column++) {
                System.out.printf("%4d", column * row);
            }
          
            System.out.println();
        }
        input.close();
    }
}
