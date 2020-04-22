
public class Money {

    private int euros;
    private int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
   public Money plus(Money addition) {
       Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
       
       return newMoney;
   }
   
   public boolean lessThan(Money compared) {
       Money lessMoney = new Money(compared.euros, compared.cents);
       
       if(this.euros < lessMoney.euros) {
           return true;
       } else if(this.euros == lessMoney.euros) {
           if(this.cents < lessMoney.cents) {
               return true;
           } else {
               return false;
           }
       } else {
           return false;
       }
   }
   
   public Money minus(Money decreaser) {
      int thisCents = this.cents + this.euros *100;
      int thatCents = decreaser.cents + decreaser.euros * 100;
      int minusCents = thisCents - thatCents;
      
      if(minusCents < 0) {
          minusCents = 0;
      }
      
       
       Money newMoney = new Money(0, minusCents);
       
       return newMoney;
   }
}
