import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private int currentWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    
    public Hold(int maximumWeight) {
        this.maxWeight = maximumWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int packed = this.currentWeight + suitcase.totalWeight();
        
        if(packed > this.maxWeight) {
            return;
        } else {
            this.suitcases.add(suitcase);
            this.currentWeight += suitcase.totalWeight();
        }
    }
    
    public String toString() {
        return this.suitcases.size() + " suitcases" + " (" + this.currentWeight + " kg)";
    }
    
    public void printItems() {
        for(int i = 0; i <this.suitcases.size(); i++) {
         /*   for(int j = 0; j < this.suitcases.size(); i++) {
                this.suitcases.get(j).printItems();
            }  */
         
         this.suitcases.get(i).printItems();
         
        }
    }
}
