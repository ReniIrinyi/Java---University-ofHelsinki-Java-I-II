
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        
        int possum=0;
        int posnr=0;
        
        while(true){
            int nr=Integer.valueOf(scanner.nextLine());
            if(nr>0){
                possum+=nr;
                posnr++;
            } else if( nr<0 && nr==0){
                System.out.println("Cannot calculate the average");
            } else if(nr==0) {
                System.out.println("nnot");
                break;
            }
      
        
        }
    
        double avg=1.0*possum/posnr;
        System.out.println(avg); 
    }
}
