
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            flag = false;
            System.out.println("Carry on?");
            String input = scanner.nextLine();
            if(input.equals("no")) {
                break;
            } else {
                flag = true;
            }
        }
    }
}
