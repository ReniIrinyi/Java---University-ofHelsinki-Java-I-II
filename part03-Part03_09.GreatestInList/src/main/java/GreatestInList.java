
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max=0;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");
        
        
            for(int i=0; i<=list.size()-1; i++){
                 max=list.get(i)>max ? list.get(i) : max;
            };
        System.out.println("The greatest number: "+max);
    }
}
