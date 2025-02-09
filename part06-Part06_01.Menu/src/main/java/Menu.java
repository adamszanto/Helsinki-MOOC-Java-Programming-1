
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    
    public void addMeal(String meal) {
        if(this.meals.contains(meal)){
            System.out.println(meal +" is already on the list");
        } else {
            this.meals.add(meal);
        }
    }
    
    public void printMeals() {
        for(int i = 0; i < this.meals.size(); i++) {
            System.out.println(this.meals.get(i));
        }
    }
    
    public void clearMenu() {
       meals.clear();
    }
    
    // implement the required methods here
}
