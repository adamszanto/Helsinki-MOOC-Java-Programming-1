
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            String story = scanner.nextLine();
            if(story.equals("")) {
                flag = false;
            } else {
                String[] chopped = story.split(" ");
                for(int i = 0; i < chopped.length; i++) {
                    System.out.println(chopped[i]);
                }
            }
        }

    }
}
