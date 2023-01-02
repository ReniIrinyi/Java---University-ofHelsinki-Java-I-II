
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int inputnr=0;
        
        while(true){
            System.out.println("Give a number:");
            int nr=Integer.valueOf(scanner.nextLine());
            if(nr>0 || nr<0){
                inputnr +=nr;
                continue;
            }
            if(nr==0){
                System.out.println("Sum of the numbers: "+inputnr);
                break;
            }
            
        }
    }
}
