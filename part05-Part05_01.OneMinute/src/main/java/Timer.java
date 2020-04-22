public class Timer {
    ClockHand seconds = new ClockHand(60);
    ClockHand hundreths = new ClockHand(100);
    
    public void advance() {
        this.hundreths.advance();
        
        if(this.hundreths.value() == 0) {
            this.seconds.advance();
        }
    }
    
    public String secondsToString() {
        if (this.seconds.value() < 10) {
            return "0" + this.seconds.value();
        }

        return "" + this.seconds.value();
    }
    
    public String hundrethsToString() {
        if (this.hundreths.value() < 10) {
            return "0" + this.hundreths.value();
        }

        return "" + this.hundreths.value();
    }
    
    public String toString() {
        return secondsToString() + ":" + hundrethsToString();
    }
}
