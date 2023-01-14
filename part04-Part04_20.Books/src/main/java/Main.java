import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList <Book> books=new ArrayList<>();

        while(true){
            System.out.println("Title: ");
            String inputTitle=scanner.nextLine();
            if(inputTitle.isEmpty()){
            break;
            }
            System.out.println("Pages: ");
            int inputPages=Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int inputPublication=Integer.valueOf(scanner.nextLine());
            books.add(new Book(inputTitle, inputPages, inputPublication));
        }
        
        System.out.println("What information will be printed? ");
        String input=scanner.nextLine();
        
        if(input.equals("everything")){
            for(Book item:books){
            System.out.println(item.getTitle()+", "+item.getPages()+" pages, "+item.getPublication() );

        }
        
        } else if(input.equals("name")){
        for(Book item:books){
            
            System.out.println(item.getTitle());


        }
        
    }
 
    
    }
}
