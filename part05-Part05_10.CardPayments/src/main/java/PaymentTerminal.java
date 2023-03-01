
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money=1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if(payment <2.50|| payment>this.money)return payment;
        else {
        this.affordableMeals++;
        double remain= payment-2.50;
        this.money+=2.50;
        return remain;
        }
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
       if(payment <4.30 || payment>this.money) return payment;
       else {
       this.heartyMeals++;
        double remain= payment-4.30;
        this.money+=4.30;
        return remain;
       }
    }
    
    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if(card.balance()<2.50){
        return false;
        }
       
        card.takeMoney(2.50);
        this.affordableMeals++;
        return true;
        
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if(card.balance()<4.30){
        return false;
        }
       
        card.takeMoney(4.30);
        this.heartyMeals++;
        return true;
    }
    
     public void addMoneyToCard(PaymentCard card, double summa){
        if(summa > 0){
        this.money+=summa;
        card.addMoney(summa);
    }
         
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
