
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr=Integer.valueOf(scanner.nextLine());
        int fact=1;

        for(int i=2; i<=nr; i++ ){
            fact*=i;

        }



        System.out.println("Factorial: "+fact);
    }
}
