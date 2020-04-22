import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    ArrayList<Recipe> recipes;
    
    public TextUI(Scanner scanner) {
        this.scanner = scanner;
        recipes = new ArrayList<>();
    }
    
    public void start() {
        System.out.print("File to read: ");
        String filename = scanner.nextLine();
        processFile(filename);
        mainMenu();
    }
    
    private void mainMenu() {
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        
        while(true) {
            System.out.println("Enter command:");
            String command = scanner.nextLine();
            
            boolean exit = false;
            switch(command) {
                case "list":
                    executeList();
                    break;
                
                case "find name":
                    executeFindName();
                    break;
                    
                case "stop": 
                    exit = true;
                    break;
                    
                case "find cooking time":
                    executeFindTime();
                    break;
                    
                case "find ingredient":
                    executeIngredient();
                    break;
                    
                default:
            } if(exit){
                break;
            }
        }
    }
    
    private void executeIngredient() {
        System.out.print("Ingredient: ");
        String ingredient = scanner.nextLine();
        ArrayList<Recipe> searchResults = new ArrayList<>();
        
        for(int i = 0; i < recipes.size(); i++){
           if(recipes.get(i).getIngredient().contains(ingredient)){
               searchResults.add(recipes.get(i));
           }
        }
        
        for(Recipe recipe : searchResults) {
            System.out.println(recipe.toString());
        }
    }
    
    private void executeFindTime() {
        System.out.println("Max cooking time:");
        int times = Integer.valueOf(scanner.nextLine());
        ArrayList<Recipe> searchResults = new ArrayList<>();
        
        for(Recipe recipe : recipes) {
            if(times >= recipe.getTime()) {
                searchResults.add(recipe);
            }
        }
        for(Recipe recipe : searchResults){
            System.out.println(recipe.toString());
        }
    }
    
    private void executeFindName() {
        System.out.println("Searched word:");
        String word = scanner.nextLine();
        ArrayList<Recipe> searchResults = new ArrayList<>();
        
        for(Recipe recipe : recipes) {
            if(recipe.getName().contains(word)) {
                searchResults.add(recipe);
            } 
        }
        for(Recipe recipe : searchResults) {
            System.out.println(recipe.toString());
        }
    }
    
    private void executeList() {
        for(Recipe recipe : recipes) {
            System.out.println(recipe);
        } 
    }
    
    private void processFile(String filename) {
        try(Scanner fileScanner = new Scanner(Paths.get(filename))) {
            while(fileScanner.hasNextLine()) {
                String recipeName = fileScanner.nextLine();
                int cookingTime = Integer.valueOf(fileScanner.nextLine());
                Recipe newRecipe = new Recipe(recipeName, cookingTime);
                // we deal with the ingredients from now on, until we hit an empty line
                while(true){
                    if(fileScanner.hasNextLine()) {
                        String line = fileScanner.nextLine();
                        if(line.isEmpty()) {
                            break;
                        }
                        newRecipe.addIngredient(line);
                    } else {
                        break;
                    }
                }
                // add the recipe to the list after the loop finished processing    
                recipes.add(newRecipe);
            }
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } 
    }
}
