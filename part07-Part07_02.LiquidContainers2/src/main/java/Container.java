public class Container {
    private int container;
    
    public Container() {
        this.container = 0;
    }
    
    public int contains() {
        return this.container;
    }
    
    public void containerZero() {
        this.container = 0;
    }
    
    public void modifyContainer(int amount) {
        this.container = amount;
    }
    
    public void add(int amount) {
        if(amount > 100) {
            this.modifyContainer(100);
        } else if(amount < 0) {
            return;
        } else {
            this.container += amount;
            if(this.container > 100) {
                this.container = 100;
            }
        }
 
    }
    
    public void remove(int amount) {
        if(this.container - amount < 0) {
            this.container = 0;
        } else {
            this.container -= amount;
        }
    }
    
    public String toString(){
        return this.contains() + "/100";
    }
    
}
