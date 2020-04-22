
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int first = scanner.nextInt();
        System.out.println("Give me a number: ");
        int second = scanner.nextInt();
        
        int number = first + second;
        double square = Math.sqrt(number);
        System.out.println(square);
    }
}
