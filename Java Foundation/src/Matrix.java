import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public  class  Matrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter number of lines and press <Enter>:");
        int numberLines = scanner.nextInt();

        System.out.println("Enter number of columns and press <Enter>:");
        int numberColumns = scanner.nextInt();

        int[][] matrix = new int[numberLines][numberColumns];

        for (int i = 0; i < numberLines; i++) {
            for (int j = 0; j < numberColumns; j++) {
                matrix[i][j] = (int) (Math.random() * (20 + 1) - 10);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        System.out.print("Sort matrix by current column (3):\n");
        for (int i = 0; i < numberColumns; i++) {
            for (int j = 0; j < numberLines; j++) {
                Arrays.sort(matrix, (o1, o2) -> o1[2] - o2[2]);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}


