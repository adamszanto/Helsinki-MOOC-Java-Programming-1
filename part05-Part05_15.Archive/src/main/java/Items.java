public class Items {
    private String identifier;
    private String name;
    
    public Items(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public String getIdentifier() {
        return this.identifier;
    }
    
    public String getName() {
        return this.name;
    }
    
    public boolean equals(Object compared) {
        if(this== compared) {
            return true;
        }
        
        if(!(compared instanceof Items)) {
            return false;
        }
        
        Items comparedItem = (Items) compared;
        
        if(this.getIdentifier().equals(comparedItem.getIdentifier())) {
            return true;
        } else {
            return false;
        }
        
    }
    
}
