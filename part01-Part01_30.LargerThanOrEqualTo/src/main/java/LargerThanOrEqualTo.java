
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int a = scan.nextInt();
        
        System.out.println("Give the second number:");
        int b = scan.nextByte();
        
        if(a > b){
            System.out.println("Larger number is: " + a);
        } else if (a < b) {
            System.out.println("Larger number is: " + b);
        } else  {
            System.out.println("The numbers are equal!");
        }  
    }
}
