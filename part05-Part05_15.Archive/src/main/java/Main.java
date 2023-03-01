
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Item> items=new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scan.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name?");
            String name = scan.nextLine();
            if (name.isEmpty() ) {
                break;
            }

            Item item=new Item(identifier, name);
            if(!(items.contains(item))){
               items.add(item);
            }
        }
         for(Item i:items){
                System.out.println(i);
         }
    }
}
