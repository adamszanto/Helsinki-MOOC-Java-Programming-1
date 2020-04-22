
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        int sum = 0;
        int counter = 0;
        int oddCounter = 0;
        int evenCounter = 0;
        
        while(true) {
            int num = scanner.nextInt();
            
            if(num == -1) {
                double average = 1.0*sum/counter;
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + counter);
                System.out.println("Average: " + average);
                System.out.println("Even: " + evenCounter);
                System.out.println("Odd: " + oddCounter);
                break;
            }
            
            if(num % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
            
            if(num > 0) {
                sum += num;
                counter++;
            }
        }
    }
}
