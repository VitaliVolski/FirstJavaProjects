import java.time.Month;
import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int number;
        System.out.println("Enter month number:");
        number = num.nextInt();

        while (number <= 0 || number > 12) {
            System.out.println("Enter valid month number!");
            number = num.nextInt();
        }
        if (number > 0 || number < 13) {
            System.out.println(Month.of(number) + "!");
        }
    }
}