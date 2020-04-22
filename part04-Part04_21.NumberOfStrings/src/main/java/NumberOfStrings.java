
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        int counter = 0;
        while(flag){
            String line = scanner.nextLine();
            
            if(line.equals("end")){
                flag = false;
                break;
            } else {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
