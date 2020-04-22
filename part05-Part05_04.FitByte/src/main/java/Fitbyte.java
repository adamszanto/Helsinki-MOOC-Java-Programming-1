public class Fitbyte {
    private int age;
    private int restingHeartRate;
    
    public Fitbyte(int constAge, int constRestingHeartRate) {
        this.age = constAge;
        this.restingHeartRate = constRestingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        double maximumHeartRate = 206.3 - (0.711*age);
        
        return ((maximumHeartRate - this.restingHeartRate) * percentageOfMaximum + this.restingHeartRate);
    }
}
