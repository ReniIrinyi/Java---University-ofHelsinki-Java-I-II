
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr1=Integer.valueOf(scanner.nextLine());
        int nr2=Integer.valueOf(scanner.nextLine());
        if(nr1>nr2){
            System.out.println(nr1 + "is greater than" +nr2);
        } else if (nr1<nr2) {
            System.out.println(nr1 + "is smaller than" +nr2);
        } else {
            System.out.println(nr1 + "is equal to" + nr2);
        }
        
       
    }
}
