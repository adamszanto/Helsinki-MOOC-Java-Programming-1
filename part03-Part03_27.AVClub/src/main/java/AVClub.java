
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        
        while(flag) {
            String story = scanner.nextLine();
            if(story.equals("")){
                flag = false;
            } else {
                String[] chopped = story.split(" ");
                
                for(int i = 0; i < chopped.length; i++){
                    if(chopped[i].contains("av")){
                        System.out.println(chopped[i]);
                    }
                }
            }
        }

    }
}
