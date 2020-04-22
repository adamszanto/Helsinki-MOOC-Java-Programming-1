import java.util.ArrayList;

public class Room {
    ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        persons.add(person);
    }
    
    public boolean isEmpty() {
        if(this.persons.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        int index = 0;
        if(this.persons.isEmpty()) {
            return null;
        } else {
            for(int i = 0; i < persons.size(); i++) {
                if(this.persons.get(i).getHeight() < this.persons.get(index).getHeight()) {
                    index = i;
                }
            }   
        }
        
        return persons.get(index);
    }
    
    public Person take() {
        int index = 0;
        if(this.persons.isEmpty()) {
            return null;
        } else {
            for(int i = 0; i < persons.size(); i++) {
                if(this.persons.get(i).getHeight() < this.persons.get(index).getHeight()) {
                    index = i;
                }
            }   
        }
        
        return persons.remove(index);
    }
}
