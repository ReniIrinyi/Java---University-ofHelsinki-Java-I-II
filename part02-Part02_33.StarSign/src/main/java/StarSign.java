
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        for(int star=0; star<number; star++){
            System.out.print("*");
        };
        System.out.println("");
    }

    public static void printSquare(int size) {
        for(int sz=1; sz<=size;sz++ ){
            printStars(size);
        };
    }

    public static void printRectangle(int width, int height) {
        for(int h=1; h<=height; h++){
            
            for(int w=1; w<=width;w++ ){
                System.out.print("*");
            };
            System.out.println("");
        };
    }

    public static void printTriangle(int size) {
        for(int w=1; w<=size; w++){
            printStars(w);
        }
    }
}
