import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    
    private TodoList todoList = new TodoList();
    private Scanner scanner = new Scanner(System.in);
    
    public UserInterface(TodoList todoList, Scanner scanner) {
       this.todoList = todoList;
       this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if(command.equals("stop")) {
                break;
            } else if(command.equals("add")) {
                System.out.print("To add: ");
                String toAdd = scanner.nextLine();
                todoList.add(toAdd);
            } else if(command.equals("list")) {
                todoList.print();
            } else if(command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int choose = Integer.valueOf(scanner.nextLine());
                todoList.remove(choose);
            }
            
        }
    }
}
