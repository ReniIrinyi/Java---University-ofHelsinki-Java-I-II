
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
    return compared.squares < this.squares? true : false;
    }

    public int priceDifference(Apartment compared){
    return Math.abs((this.princePerSquare*this.squares)-(compared.princePerSquare*compared.squares));
    }
    
    public boolean moreExpensiveThan(Apartment compared){
    return (compared.princePerSquare*compared.squares) < (this.princePerSquare*this.squares) ? true : false;
    }
}
