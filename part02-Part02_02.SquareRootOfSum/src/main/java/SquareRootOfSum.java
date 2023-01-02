
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr1=Integer.valueOf(scanner.nextLine());
        int nr2=Integer.valueOf(scanner.nextLine());
        double sqr=Math.sqrt((nr1+nr2));
        System.out.println(sqr);

    }
}
