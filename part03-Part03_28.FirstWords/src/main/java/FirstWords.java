
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
        String input=scanner.nextLine();
            
        String [] strings=input.split(" ");
            System.out.println(strings[0]);


        if(input.equals(""))
        {   break;
                }


}

    }
}
