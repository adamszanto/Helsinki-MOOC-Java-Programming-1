import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts = new ArrayList<>();
    
    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }
    
    public Package() {
        this.gifts = new ArrayList<>();
    }
    
    public int totalWeight(){
       int totalWeight = 0;
       
       for(int i = 0; i < gifts.size(); i++) {
           totalWeight = totalWeight + gifts.get(i).getWeight();
       }
       return totalWeight;
    }
}
