
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String oldestName = "no name yet.";
        int oldestAge = 0;
        boolean flag = true;
        
        while(flag){
            String input = scanner.nextLine();
            if(input.equals("")){
                flag = false;
            } else {
                String[] info = input.split(",");
                int ageCheck = Integer.valueOf(info[1]);
                String nameCheck = info[0];
                if(ageCheck > oldestAge){
                    oldestAge = ageCheck;
                    oldestName = nameCheck;
                }
            }   
            System.out.println("Name of the oldest: " + oldestName);
        }

    }
}
