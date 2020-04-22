
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        
        while(flag) {
            String story = scanner.nextLine();
            
            if(story.equals("")){
                flag = false;
            } else {
                String[] chopped = story.split(" ");
                System.out.println(chopped[0]);
            }
        }

    }
}
