
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        
        while(true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();
            
            if(number < 0) {
                counter++;
                continue;
            } else if(number == 0) {
                System.out.println("Number of negative numbers: " + counter);
                break;
            } else {
                continue;
            }
        }
        
    }
}
