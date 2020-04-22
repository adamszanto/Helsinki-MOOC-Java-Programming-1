
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String answerOne = scanner.nextLine();
        
        System.out.println("Give an integer:");
        int answerTwo = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give a double:");
        double answerThree = Double.valueOf(scanner.nextLine());
        
        System.out.println("Give a boolean:");
        boolean answerFour = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string " + answerOne);
        System.out.println("You gave the integer " + answerTwo);
        System.out.println("You gave the double " + answerThree);
        System.out.println("You gave the boolean " + answerFour);

    }
}
