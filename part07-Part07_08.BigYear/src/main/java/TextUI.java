import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    ArrayList<Bird> birdList;
    
    public TextUI(Scanner scanner) {
        this.scanner = scanner;
        birdList = new ArrayList<>();
    }
    
    public void start(){
        while(true){
            System.out.print("? ");
            String command = scanner.nextLine();
            
            boolean exit = false;
            switch(command) {
                
                case "Quit":
                    exit = true;
                    break;
                    
                case "One":
                    executePrintOne();
                    break;
                
                case "Add":
                    executeAdd();
                    break;
                    
                case "Observation":
                    executeObservation();
                    break;
                    
                    
                case "All":
                    executePrintAll();
                    break;
                                        
                default:     
            } if(exit){
                break;
            }
        }
    }
    
    public void executePrintOne(){
        System.out.print("Bird? ");
        String birdName = scanner.nextLine();
        
        for(int i = 0; i < birdList.size(); i++) {
            if(birdList.get(i).getName().equals(birdName)){
                System.out.println(birdList.get(i).toString());  
            }
        }
    }
    
    public void executePrintAll(){
        for(int i = 0; i < birdList.size(); i++){
            System.out.println(birdList.get(i).toString());
        }
    }
    
    public void executeObservation(){
        System.out.print("Bird? ");
        String name = scanner.nextLine();
        
        
        
        for(int i = 0; i < birdList.size(); i++){
            int counter = 0;
            if(birdList.get(i).getName().equals(name)){
                birdList.get(i).addObservation();
                counter++;
            }
            
            if(counter < 1) {
                System.out.println("Not a bird!");
            }
        }
    }
    
    public void executeAdd() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = scanner.nextLine();
        
        Bird newBird = new Bird(name, latinName);
        birdList.add(newBird);
    }
    
}
