
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double change;
        
        if(payment < 2.50) {
            change = payment;
            return change;
        } else {
            this.affordableMeals++;
            this.money += 2.50;
            change = payment - 2.50;
            return change;
        }
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double change;
        
        if(payment < 4.30) {
            change = payment;
            return change;
        } else {
          this.heartyMeals++;
          this.money += 4.30;
          change = payment - 4.30;
          return change;
        }
    }
    
    public boolean eatAffordably(PaymentCard card) {
        if(card.balance() < 2.50) {
            return false;
        } else {
            this.affordableMeals++;
            card.takeMoney(2.50);
            return true;
        }
    }
    
    public boolean eatHeartily(PaymentCard card) {
       if(card.balance() < 4.30) {
           return false;
       } else {
           this.heartyMeals++;
           card.takeMoney(4.30);
           return true;
       }
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if(sum < 0) {
            return;
        }
        
        if(card.balance() < sum) {
            this.money += 0;
            card.addMoney(0);
        }
        this.money += sum;
        card.addMoney(sum);
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
