public class Cube {
    
    private int edgeLength;
   
    public Cube (int length) {
        this.edgeLength = length;
    }
    
    public int volume() {
        int volume = this.edgeLength * this.edgeLength * this.edgeLength;
        return volume;
    }
    
    public String toString() {
        return "The length of the edge is " + this.edgeLength + " and the volume " + this.volume();
    }
}
