
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> list=new ArrayList<>();
        System.out.print("File? ");
        String filename=scanner.nextLine();
       
        try(Scanner filescanner=new Scanner(Paths.get(filename))){
            while(filescanner.hasNextLine()){
                int nr=Integer.valueOf(filescanner.nextLine());
                list.add(nr);
            }
     
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int count=0;
            for (int i=0; i<list.size(); i++){
                if(list.get(i) >=lowerBound && list.get(i)<=upperBound){
                    count ++;
                
                } 
                System.out.println("Numbers: "+count);
            
            } 
        }catch(Exception e){
            System.out.println("Error");
        };
        
        
        

    }

}
