
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int val=Integer.valueOf(scan.nextLine());
        double rate1=(100+(val-5000)*0.08);
        double rate2=(1700+(val-25000)*0.10);
        double rate3=(4700+(val-55000)*0.12);
        double rate4=(22100+(val-200000)*0.15);
        double rate5=(142100+(val-1000000)*0.17);
        if(val < 5001){
            System.out.println("No tax!");
        } else if(val > 4999 && val<25001){

            System.out.println("Tax: "+ rate1);
        } else if(val > 24999 && val < 55001){
            System.out.println("Tax: "+ rate2);
        
        } else if(val > 54999 && val < 200001){
            System.out.println("Tax: "+ rate3);
        
        } else if(val > 199999 && val < 1000001){
            System.out.println("Tax: "+rate4);
        } else {
            System.out.println("Tax: "+rate5);
        }
    }
}
