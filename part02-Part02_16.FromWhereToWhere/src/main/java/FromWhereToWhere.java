
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int inputnr=Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int starting=Integer.valueOf(scanner.nextLine());
        for(int i=starting; i<=inputnr;i++){
            System.out.println(i);
        }
    }
}
