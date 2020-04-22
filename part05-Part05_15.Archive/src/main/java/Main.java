import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Items> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        
        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if(identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            
            Items listItem = new Items(identifier, name);
            
            if(items.contains(listItem)) {
                break;
            } else {
                items.add(listItem);
            }
        }
        
        // check if the list add function is working well
        System.out.println("==Items==");
        for(int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getIdentifier() +": " +items.get(i).getName());
        }

    }
}
