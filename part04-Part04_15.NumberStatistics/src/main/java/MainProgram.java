
import java.util.Scanner;

public class MainProgram {
    
   public static void main(String[] args) {
   Statistics stat=new Statistics();
   Statistics even=new Statistics();
   Statistics odd=new Statistics();
   System.out.println("Enter numbers:");
   Scanner scanner = new Scanner(System.in);
      
        while(true){
     int inputNr=Integer.valueOf(scanner.nextLine());

       if(inputNr==-1){
           
      System.out.println("Sum: "+stat.sum());
      System.out.println("Sum of Evens: "+even.sum());
      System.out.println("Sum of Odds: "+odd.sum());
            break;}
       
if(inputNr>=0){
     stat.addNumber(inputNr);
            if(inputNr%2==0 ){
                even.addNumber(inputNr);
            }
            
            if(inputNr%2!=0){
          odd.addNumber(inputNr);
            } 
    }
}
    }
        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    
}
