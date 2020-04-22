
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        TextUI ui = new TextUI(scan);
        ui.start();

    }

}
