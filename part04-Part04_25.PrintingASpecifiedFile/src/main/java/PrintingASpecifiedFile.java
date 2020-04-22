
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed?");
        String decision = scanner.nextLine();
      
        
        try(Scanner input = new Scanner(Paths.get(decision))) {
            while(input.hasNextLine()) {
                String row = input.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
