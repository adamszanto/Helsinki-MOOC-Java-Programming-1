
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int value = scanner.nextInt();
        String seconds = String.valueOf(value * 24*60*60);
        System.out.println(seconds);
        
        
        // Write your program here

    }
}
