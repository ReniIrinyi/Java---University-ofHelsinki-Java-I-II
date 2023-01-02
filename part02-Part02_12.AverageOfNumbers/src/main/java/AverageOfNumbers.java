
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum=0;
        int inputnr=0;
      
        
        while(true){
            System.out.println("Give a number :");
            int nr=Integer.valueOf(scanner.nextLine());
            if(nr>0 || nr<0){
                inputnr +=1;
                sum+=nr;
                
                continue;
            }
            if(nr==0){
               
                break;
            }
            
        } 
        double avg= 1.0*sum/inputnr;
        System.out.println("Average of the numbers: "+avg );;
    }
}
