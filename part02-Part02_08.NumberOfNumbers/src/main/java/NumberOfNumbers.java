
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int inputnr=0;
        
        while(true){
            System.out.println("Give a number:");
            int nr=Integer.valueOf(scanner.nextLine());
            if(nr>0 || nr<0){
                inputnr +=1;
                continue;
            }
            if(nr==0){
                System.out.println("Number of numbers: "+inputnr);
                break;
            }
            
        }
 
        

        
        
    }
}
