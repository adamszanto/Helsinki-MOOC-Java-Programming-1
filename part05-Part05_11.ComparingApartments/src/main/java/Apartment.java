
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if(this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }
    
    public int priceDifference(Apartment compared) {
        int princeCompare = (this.squares * this.princePerSquare)-(compared.squares * compared.princePerSquare);
        
        if(princeCompare < 0) {
            princeCompare = princeCompare * (-1);
        }
        
        return princeCompare;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if((this.squares * this.princePerSquare)>(compared.squares * compared.princePerSquare)) {
            return true;
        } else {
            return false;
        }
    }
}
