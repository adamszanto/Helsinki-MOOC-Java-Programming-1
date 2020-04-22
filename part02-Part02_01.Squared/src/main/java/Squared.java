
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int number = scanner.nextInt();
        String value = String.valueOf(number*number);
        System.out.println(value);
    }
}
