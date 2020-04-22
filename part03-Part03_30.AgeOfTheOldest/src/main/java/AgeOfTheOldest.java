
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int oldestAge = 0;
        
        while(flag){
            String input = scanner.nextLine();
            if(input.equals("")){
                flag = false;
            } else {
                String[] chopped = input.split(",");
                int checkAge = Integer.valueOf(chopped[1]);
                if(checkAge > oldestAge){
                    oldestAge = checkAge;
                }
            }
        }
        System.out.println("Age of the oldest: " + oldestAge);
    }
}
