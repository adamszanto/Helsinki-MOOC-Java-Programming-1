
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList();
        
        while(true) {
            int input = scanner.nextInt();
            if(input == -1) {
                break;
            } else {
                list.add(input);
            }
        }
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        double sum = 0;
        
        for(double lists: list) {
            sum += lists;
        }
        
        double average = sum / list.size();
        
        System.out.println("Average: " + average);
        
        
    }
}
