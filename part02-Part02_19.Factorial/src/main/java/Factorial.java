
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number:");
        int num = scanner.nextInt();
        int factorial = 1;
        
        while(num > 1) {
            factorial *= num;
            num--;
        }
        System.out.println("Factorial: " + factorial);
    }  
}
