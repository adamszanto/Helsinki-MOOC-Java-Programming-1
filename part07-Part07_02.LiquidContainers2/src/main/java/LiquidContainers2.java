
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();
        
        

        while (true) {
  
            System.out.println("First: " + first.contains() + "/100");
            System.out.println("Second: " + second.contains() + "/100");
            
            String input = scan.nextLine(); 
            

            if (input.equals("quit")) {
                break;
            } else if(input.contains("add")) {
                
                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
                
                if(amount < 0) {
                    amount = 0;
                }
                
                first.add(amount);
                if(first.contains() > 100) {
                    first.add(100);
                }
                
            } else if(input.contains("remove")) {
                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]); 
                
                second.remove(amount);
                
                if(second.contains() < 0) {
                    second.containerZero();
                }
                
            } else if(input.contains("move")) {
                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
                
                int remainder;
                
                if(amount > 100) {
                    amount = 100;
                }
                
                if(amount >= first.contains()) {
                    remainder = first.contains();
                    first.containerZero();
                    second.add(remainder);
                } else if(amount < 0) {
                    return;
                } else {
                    first.remove(amount);
                    second.add(amount);
                }
                
                if(first.contains() > 100) {
                    first.add(100);
                }
                
                if(second.contains() > 100) {
                    second.add(100);
                }
                
                if(first.contains() < 0) {
                    first.add(0);
                }
                
                if(second.contains() < 0) {
                    second.add(0);
                }
                
            }
        }
    }

}
