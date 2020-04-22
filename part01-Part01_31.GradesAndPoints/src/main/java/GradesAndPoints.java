
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String grade = "impossible!";
        
        if(a < 0){
            grade = grade;
        } else if(a >= 0 && a <= 49 ) {
            grade = "failed";
        } else if(a >= 50 && a <= 59) {
            grade = "1";
        } else if(a >= 60 && a <= 69) {
            grade = "2";
        } else if(a >= 70 && a <= 79) {
            grade = "3";
        } else if(a >= 80 && a <= 89) {
            grade = "4";
        } else if(a >= 90 && a <= 100) {
            grade = "5";
        } else if(a > 100) {
            grade = "incredible!";
        }
        
        
        System.out.println("Grade: " + grade);
        
    }
}
