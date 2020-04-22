
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String longestName = "";
        int yearSum = 0;
        int yearCounter = 0;
        boolean flag = true;
        
        while(flag){
            String answer = scanner.nextLine();
            
            if(answer.equals("")){
                flag = false;
            } else {
                String[] validAnswer = answer.split(",");
                String name = String.valueOf(validAnswer[0]);
                int year = Integer.valueOf(validAnswer[1]);
                yearCounter++;
                yearSum = yearSum + year;
                if(name.length() > longestName.length()){
                    longestName = name;
                }  
            }
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years :" + 1.0*yearSum/yearCounter);
    }
}
