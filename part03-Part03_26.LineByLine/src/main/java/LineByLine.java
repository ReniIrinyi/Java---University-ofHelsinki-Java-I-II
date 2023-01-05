
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
        String input=scanner.nextLine();
        String[] strings=input.split(" ");
       
        for(int i=0; i<=strings.length-1; i++){
            System.out.println(strings[i]);
       
        };
         if(input.equals("")){
         break;
                 }; 
             }
        

    }
}
