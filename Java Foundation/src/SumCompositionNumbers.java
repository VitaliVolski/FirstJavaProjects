import java.util.Scanner;

public class SumCompositionNumbers {

    public static void main(String [] args) {
        Scanner num = new Scanner(System.in);
        int first, second, third, sum;

        System.out.println("Enter first number:");
        first = num.nextInt();

        System.out.println("Enter second number:");
        second = num.nextInt();

        System.out.println("Enter third number:");
        third = num.nextInt();

        sum= first+second+third;
        int comp = first * second * third;

        System.out.println("result is -"+ " " + sum);
        System.out.println("result is -"+ " " + comp);
    }
}