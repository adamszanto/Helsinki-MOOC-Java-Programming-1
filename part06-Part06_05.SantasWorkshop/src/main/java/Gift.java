
public class Gift {
    
    private String name;
    private int weight;
    
    public Gift(String giftName, int weightName) {
        this.name = giftName;
        this.weight = weightName; 
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getWeight() {
        return this.weight;
    }
    
    public String toString() {
        return this.name + "(" + this.weight + "kg)";
    }
    
}
