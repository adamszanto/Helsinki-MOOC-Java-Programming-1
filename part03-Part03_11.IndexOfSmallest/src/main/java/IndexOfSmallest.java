
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList();
        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        while(true) {
            int input = scanner.nextInt();
            if(input == 9999) {
                break;
            } else {
                list.add(input);
            }
        }

        int small = list.get(0);
        
        for(int i = 0; i < list.size(); i++) {
           if(list.get(i) < small) {
               small = list.get(i);
           } 
        }
        System.out.println("Smallest number: " + small);
        
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == small) {
                System.out.println("Found at index: " + i);
            }
        }
        
    }
}
