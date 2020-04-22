
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int number = scanner.nextInt();
        
        if(number < 0) {
            number = number * -1;
            System.out.println(number);
        } else {
            System.out.println(number);
        }
    }
}
