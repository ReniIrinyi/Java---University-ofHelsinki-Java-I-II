
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr=Integer.valueOf(scanner.nextLine());
        int mnr=-1;
        if(nr<0){
            System.out.println(nr*mnr);
        } else {
            System.out.println(nr);
        }

    }
}
