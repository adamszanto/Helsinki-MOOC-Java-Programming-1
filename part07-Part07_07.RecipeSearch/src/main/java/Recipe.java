import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
  
    public Recipe(String name, int cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
        ingredients = new ArrayList<>();
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getTime() {
        return this.cookingTime;
    }
    
    public ArrayList<String> getIngredient() {
            return ingredients;
    }
    
    
    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }
    
    @Override
    public String toString() {
        return name + ", cooking time: " + cookingTime;
    }
}
