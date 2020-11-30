import java.util.Arrays;
import java.util.Scanner;


public class IncreaseDecreaseNumbers {

    public static void main(String[] args) {
        System.out.println("Сколько чисел вы хотите ввести?");
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int[] numbers = new int[size];
        System.out.println("Введите чсила через пробел и нажмите <Enter>:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
            System.out.print(numbers[i] + " ");
        }
        int changeCounter;

        do {
            changeCounter = 0;
            for (int i = 0; i < numbers.length - 1; i++)
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    changeCounter++;
                }
        }
        while (changeCounter > 0);
        System.out.println("; В порядке возрастания :" + Arrays.toString(numbers) + ";");

        do {
            changeCounter = 0;
            for (int i = 0; i < numbers.length - 1; i++)
                if (numbers[i] < numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    changeCounter++;
                }
        }
        while (changeCounter > 0);
        System.out.println("В порядке убывания :" + Arrays.toString(numbers) + ";");
    }
}