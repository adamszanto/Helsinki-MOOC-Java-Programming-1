
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
  
    public String toString() {
        
        String printFirstOutput = "The collection " + this.name;
        String newLine = "";

        if(this.elements.isEmpty()) {
               printFirstOutput = printFirstOutput + " is empty.";
        } else if(this.elements.size() == 1) {
               printFirstOutput = printFirstOutput + " has " + this.elements.size() + " element:";
               newLine = "\n";
            
        } else {
            printFirstOutput = printFirstOutput + " has " + this.elements.size() + " elements:";
               newLine = "\n";
        }
        
        
        String outputList = "";
        
        for(int i = 0; i < elements.size(); i++) {
                String lineBreak = "\n";
                if(i == elements.size() -1) {
                    lineBreak = "";
                }
                outputList = outputList + this.elements.get(i) + lineBreak;
            }
        
        return printFirstOutput + newLine + outputList;
    }
    
}
