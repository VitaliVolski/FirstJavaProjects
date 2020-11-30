import java.util.Scanner;

public class Username {

    public static void main(String[] args) {

        System.out.println("Enter your username and press <Enter>:");

        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        System.out.println("Hello " + username);

        StringBuffer buffer = new StringBuffer("Hello " + username);
        buffer.reverse();
        System.out.println(buffer);
    }
}