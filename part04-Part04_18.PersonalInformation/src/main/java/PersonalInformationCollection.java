
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        boolean flag = true;
        
        while(flag) {
            System.out.println("First Name: ");
            String fName = scanner.nextLine();
            
            if(fName.isEmpty()) {
                flag = false;
                break;
            } 
            
            System.out.println("Last Name: ");
            String lName = scanner.nextLine();
            
            System.out.println("Identification number: ");
            String idNum = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(fName, lName, idNum));
        }
        
        for(int i = 0; i < infoCollection.size(); i++) {
            System.out.println(infoCollection.get(i).getFirstName() + " " + infoCollection.get(i).getLastName());
        }
    }
}
