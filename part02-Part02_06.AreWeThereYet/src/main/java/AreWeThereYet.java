
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 4;
        boolean flag = true;
        while(flag) {
            flag = false;
            System.out.println("Give a number: ");
            int choice = scanner.nextInt(); 
            if(number == choice) {
                break;
            } else {
                flag = true;
            }
        }
    }
}
