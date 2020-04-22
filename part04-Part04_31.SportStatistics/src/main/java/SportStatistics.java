
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        int counter = 0;
        int wins = 0;
        int losses = 0;
        
        try(Scanner scanner = new Scanner(Paths.get(file))) {
           while(scanner.hasNextLine()) {
                        String line = scanner.nextLine();
            String[] parts = line.split(",");
            String homeTeam = parts[0];
            String visitingTeam = parts[1];
            int homeTeamPoints = Integer.valueOf(parts[2]);
            int visitingTeamPoints = Integer.valueOf(parts[3]);
            
            if(team.equals(parts[0])) {
                counter++;
                
                if(homeTeamPoints > visitingTeamPoints) {
                    wins++;
                } else {
                    losses++;
                }
                
            }
            
            if(team.equals(parts[1])) {
                counter++;
                
                if(homeTeamPoints > visitingTeamPoints) {
                    losses++;
                }  else {
                    wins++;
                }
            }  
            
            
           }
            
            
        } catch (Exception e) {
            System.out.println("Error");
        }
        
        System.out.println("Games: " + counter);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
