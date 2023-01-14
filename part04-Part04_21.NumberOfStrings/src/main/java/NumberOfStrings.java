
import java.util.Scanner;
import java.util.ArrayList;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList list=new ArrayList<>();
        while(true){
            System.out.println("");
            String input=scanner.nextLine();
            list.add(input);
        if(input.equals("end") ){
        break;
        }
            
            System.out.println(list.size());
        }
    }
}
