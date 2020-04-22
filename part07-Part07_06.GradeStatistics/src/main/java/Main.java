
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        int counter = 0;
        int sum     = 0;
        double average = 0;
        
        int passCounter = 0;
        int passSum = 0;
        double passAverage = 0;
        double passPercentage = 0;
        
        String grade_0 = "";
        String grade_1 = "";
        String grade_2 = "";
        String grade_3 = "";
        String grade_4 = "";
        String grade_5 = "";
        
        
        
        System.out.println("Enter points totals, -1 stops:");
        
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == -1) {
                break;
            } else if(number < 100 && number > 0) {
                sum += number;
                counter++;
                
                if(number >= 90) {
                    grade_5+="*";
                }
                
                if(number >= 80 && number < 90){
                    grade_4+="*";
                }
                
                if(number >= 70 && number < 80) {
                    grade_3+="*";
                }
                
                if(number >= 60 && number < 70) {
                    grade_2+="*";
                }
                
                if(number >= 50 && number < 60) {
                    grade_1+="*";
                }
                
                if(number < 50) {
                    grade_0+="*";
                }
                
                
                
                if(number >= 50) {
                    passCounter++;
                    passSum += number;
                    passAverage = 1.0 * passSum / passCounter;
                }
                
               // System.out.println("Last number to add is :" + number);
               // System.out.println("Counter is at: " + counter);
                average = 1.0 * sum / counter;
               // System.out.println("Average is at: " + average);
            } 
        }
        
        System.out.println("Point average (all): " + average);
        System.out.println("Points average (passing): " + passAverage);
        System.out.println("Pass percentage: " + 1.0* 100* passCounter/counter);
        System.out.println("Grade distribution: ");
        System.out.println("5: " + grade_5);
        System.out.println("4: " + grade_4);
        System.out.println("3: " + grade_3);
        System.out.println("2: " + grade_2);
        System.out.println("1: " + grade_1);
        System.out.println("0: " + grade_0);
         
    }
    
}
