
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where to? ");
        int number = scanner.nextInt();
        System.out.print("Where from? ");
        int i = scanner.nextInt();
        
        // Write your program here
        while(i <= number){
            System.out.println(i);
            i++;
        }
    }
}
