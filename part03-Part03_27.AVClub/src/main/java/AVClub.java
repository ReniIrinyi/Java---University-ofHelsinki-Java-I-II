
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
        String input=scanner.nextLine();
        String [] strings=input.split(" ");
        for(int i=0; i<strings.length; i++){
        if(strings[i].contains("av")){
            System.out.println(strings[i]);
         
        }
        };
           if(input.equals("")){
           break;}
        
        };

    }
}
