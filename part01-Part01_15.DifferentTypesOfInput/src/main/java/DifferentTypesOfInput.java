
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String string=scan.nextLine();
        System.out.println("Give an integer:");
        int inte =Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double dob= Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean bol=Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " +string);
        System.out.println("You gave the integer " +inte);
        System.out.println("You gave the double " +dob);
        System.out.println("You gave the boolean " +bol);
        

    }
}
