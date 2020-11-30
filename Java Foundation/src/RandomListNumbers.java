import java.util.Arrays;
import java.util.Random;


public class RandomListNumbers {

    public static void main(String[] args) {

        int[] array = new int[5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array [i] = (int) random.nextInt(10);
            System.out.println(array [i]);}

        for (int i = 0; i < array.length; i++) {
            array [i] = (int) random.nextInt(10);
            System.out.print(array [i]);
        }
    }
}