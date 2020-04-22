import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager() {
        this.jokes = new ArrayList<String>();
    }
    
    public void addJoke(String joke) {
        jokes.add(joke);
    }
    
    public String drawJoke(){
       /* if(this.jokes.isEmpty()){
            return "Jokes are in short supply.";
        } else {
           int random = (int)(Math.random() * this.jokes.size());
           return this.jokes.get(random); 
        } */

       if (jokes.isEmpty()) {
        return "Jokes are in short supply.";
        } else {
        Random draw = new Random();
        int index = draw.nextInt(jokes.size());
        return jokes.get(index);
        }
    }
    
    public void printJokes() {
        for(int i = 0; i < jokes.size(); i++) {
            System.out.println(this.jokes.get(i));
        }
    }
    
}
