
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
               String input=scanner.nextLine();
               String [] strings=input.split(" ");
               System.out.println(strings[strings.length-1]);
        if(input.equals("")){
        break;
        };
        }
 
        

    }
}
