
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the third number:");
        int three = Integer.valueOf(scanner.nextLine());
        
        int sum = first + second + three;
        System.out.println("The sum of the numbers is " + sum);
        // Write your program here

    }
}
