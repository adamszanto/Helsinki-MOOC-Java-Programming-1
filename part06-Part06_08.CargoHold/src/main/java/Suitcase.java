import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    private int currentWeight;
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
   
    
    public void addItem(Item item) {
        int packed = this.currentWeight + item.getWeight();
        
        if(packed > this.maxWeight) {
            return;
        } else {
            this.items.add(item);
            this.currentWeight += item.getWeight();
        }
    }
    
    public String toString() {
        if(this.items.isEmpty()) {
            return "no items (0kg)";
        } else if(this.items.size() == 1) {
            return "1 item (" + this.currentWeight + "kg";
        }
        return this.items.size() + " items(" + this.currentWeight + "kg)";
    }
    
    public void printItems(){
        for(int i = 0; i <this.items.size(); i++) {
            System.out.println(this.items.get(i).toString()); 
        }
    }
    
    public int totalWeight() {
      return currentWeight;
    }
    
    public Item heaviestItem() {
        
        if(items.isEmpty()) {
            return null;
        }
        
        int maxIndex = this.items.size() -1;
        
        for(int i = 0; i < this.items.size(); i++) {
            if(this.items.get(i).getWeight() > this.items.get(maxIndex).getWeight()) {
                maxIndex = i;
            }
        }
        
          Item heaviestItem = items.get(maxIndex);
          return heaviestItem;
    }
    
}
