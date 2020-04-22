
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        boolean flag = true;
        while(flag) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            if(name.isEmpty()) {
                break;
            } else {
                items.add(new Item(name));
            }
        }
        
        for(int i = 0; i < items.size(); i++) {
            System.out.println(items.toString());
        }

    }
}
