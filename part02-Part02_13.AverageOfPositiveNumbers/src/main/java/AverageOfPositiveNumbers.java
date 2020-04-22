
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double counter = 0;
        double sum = 0;
        
        while(true) {
            System.out.println("Give a number: ");
            int number = scanner.nextInt();
            if(number == 0) {
                
                if(counter == 0) {
                    System.out.println("Cannot calculate the average");
                } else {
                    System.out.println(sum/counter);
                }
                break;
            } else if (number > 0) {
                counter++;
                sum += number;
                continue;
            } else {
                continue;
            }
        }

    }
}
