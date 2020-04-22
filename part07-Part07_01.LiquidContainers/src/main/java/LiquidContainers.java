import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int first = 0;
            int second = 0;

        while (true) {
  
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            
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
                
                first += amount;
                if(first > 100) {
                    first = 100;
                }
                
            } else if(input.contains("remove")) {
                String[] parts = input.split(" ");
                String command = parts[0];
                int removeAmount = Integer.valueOf(parts[1]); 
                
                if(removeAmount > second) {
                    second = 0;
                } else  {
                    second -= removeAmount; 
                } 
                
            }




else if(input.contains("move ")) {
                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
                
                if(first == 0) {
                  amount = 0;
                  second += amount;
                } else if(amount == 0) {
                    return;
                } else if(first < amount) {
                    
                    second += first;
                    first = 0;
                    if(second > 100) {
                        second = 100;
                    }
                } else {
                  first -= amount;
                  second += amount;
                }
                
                if(second > 100) {
                    second = 100;
                }
                
                
            }
        }
    }

}
