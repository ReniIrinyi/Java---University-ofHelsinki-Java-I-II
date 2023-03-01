
public class Money {

    private final int euros;
    private final int cents;

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
    
    public Money plus(Money addition){   
    int second=addition.cents+this.cents; 
    int first= addition.euros+this.euros; 
    Money newMoney=new Money(first, second);    
    return newMoney;
    }
    
    public boolean lessThan(Money compared){

    if(compared.euros>this.euros || (compared.euros==this.euros && compared.cents>this.cents) ){
    return true;
    } 
    else {
    return false;
    }
    }
    
    public Money minus(Money decreaser){
      Money newMoney;
        int finalMoney = (this.euros * 100 + this.cents) - (decreaser.euros * 100 + decreaser.cents);
        if (finalMoney <= 0) {
            newMoney = new Money(0, 0);
        } else {
            newMoney = new Money(0, finalMoney);
        }

    
    return newMoney;
    }
       

    
    

}
