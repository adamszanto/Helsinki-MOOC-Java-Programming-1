
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("First number? ");
        int i = scanner.nextInt();
        
        System.out.print("Last number? ");
        int number = scanner.nextInt();
        
        int sum = 0;
        while(i <= number) {
            sum += i;
            i++;
        }
        System.out.println("The sum is " + sum);
    }
}
