
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Statistics stat1 = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
       
        
        
        boolean flag = true;
        
        System.out.println("Enter numbers: ");
        while(flag) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input == -1) {
                flag = false;
            } else {
                stat1.addNumber(input);
                
                if(input % 2 == 0) {
                    even.addNumber(input);
                } else {
                    odd.addNumber(input);
                }
            }
        }
        System.out.println("Sum: " + stat1.sum());   
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
    }
}
