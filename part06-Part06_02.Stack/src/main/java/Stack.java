
import java.util.ArrayList;

public class Stack { 
    
    private ArrayList<String> list = new ArrayList<String>();

    public Stack() {
        this.list = new ArrayList<>();
    }
   
    public boolean isEmpty() {
        if(this.list.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public void add(String value) {
        this.list.add(value);
    }
    
    public ArrayList<String> values() {
        return this.list;
    }
    
    public String take() {
        int topMost = list.size() -1;
        String taken = list.get(topMost);
        list.remove(taken);
        return taken;
    }
    
}
