
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String filename=scanner.nextLine();
        
        try(Scanner filescanner=new Scanner(Paths.get(filename))){
        
            while(filescanner.hasNextLine()){
            String rows=filescanner.nextLine();
            String [] parts=rows.split(",");
            int age=Integer.valueOf(parts[1]);
            String name=parts[0];
                System.out.println(name + ", "+age + " years");
            }
        
            
        }catch(Exception e){
            System.out.println("Error");}
        
    }
}
