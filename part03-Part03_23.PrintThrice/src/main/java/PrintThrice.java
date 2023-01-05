
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
       int i=1;
       while(i<=3){
           System.out.print(input);
           i++;
       }

    }
}
