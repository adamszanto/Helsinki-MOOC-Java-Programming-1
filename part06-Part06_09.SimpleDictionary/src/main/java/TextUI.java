import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {
    
    private SimpleDictionary dictionary = new SimpleDictionary();
    private Scanner scanner = new Scanner(System.in);
    
    
    
   public TextUI(Scanner scanner, SimpleDictionary dictionary) {
       this.scanner = scanner;
       this.dictionary = dictionary;
   } 
   
   public void start() {
       while(true) {
           System.out.print("Command: ");
           String command = scanner.nextLine();
           if(command.equals("end")) {
               System.out.println("Bye bye!");
               return;
           } else if(command.equals("add")) {
               System.out.print("Word: ");
               String word = scanner.nextLine();
               System.out.print("Translation: ");
               String translation = scanner.nextLine();
               dictionary.add(word, translation);
               
           } else if(command.equals("search")) {
               System.out.print("Word to be translated :");
               String search = scanner.nextLine();
               if(dictionary.translate(search) == null) {
                   System.out.println("Word " + search + " was not found");
               } else {
                   System.out.println(dictionary.translate(search));
               }
           } else {
               System.out.println("Unknown command");
           }
       }
   }
}
