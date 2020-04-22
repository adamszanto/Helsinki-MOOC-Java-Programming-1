
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int i = 100;
        int number = count;
        
        while(number <= i) {
            System.out.println(number);
            number++;
        }
    }
}
