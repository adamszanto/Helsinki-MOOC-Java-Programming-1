
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        int counter = 0;
        
        try(Scanner scanning = new Scanner(Paths.get(file))) {
           while(scanning.hasNextLine()){
               String line = scanning.nextLine();
               if (line.equals(searchedFor)){
                   counter++;
               } 
           } 
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        if(counter == 0) {
                   System.out.println("Not found.");
               } else {
                   System.out.println("Found!");
               }

    }
}
