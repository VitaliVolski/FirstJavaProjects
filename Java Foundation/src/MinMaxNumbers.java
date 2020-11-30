import java.util.Scanner;


public class MinMaxNumbers {

    public static void main (String[] args) {

        System.out.println("Сколько чисел вы собиратеетсь ввести?");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] numbers = new int[size];
        System.out.println("Введите целые числа через пробел и нажмите <Enter>");

        for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextInt();
            System.out.print(numbers[i] + " ");
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.print("Минимальное число: " + min);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(", Максимальное число: " + max);
    }
}