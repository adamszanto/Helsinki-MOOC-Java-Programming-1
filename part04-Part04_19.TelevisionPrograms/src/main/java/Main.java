import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();

            if(name.isEmpty()) {
                break;
            } else {
                System.out.print("Duration: ");
                int duration = Integer.valueOf(scanner.nextLine());
                
                programs.add(new TelevisionProgram(name, duration));
            }
            
        }
        
        System.out.print("Program's maximum duration? ");
        
        
        int max = Integer.valueOf(scanner.nextLine());
        if(max == 0) {
            return;
        } else {
            for(int i = 0; i < programs.size(); i++) {
                if(max >= 60) {
                    System.out.println(programs.get(i).toString());
                }
                
                else if(max >= programs.get(i).getDuration()) {
                    System.out.println(programs.get(i).toString());
                }
            }    
        }
         
    }
}
