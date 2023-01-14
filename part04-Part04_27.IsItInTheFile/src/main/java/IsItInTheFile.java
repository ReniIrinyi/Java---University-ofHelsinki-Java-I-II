
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList list=new ArrayList<>();
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
    try(Scanner filescanner=new Scanner(Paths.get(file))){
        while(filescanner.hasNextLine()){
        String row=filescanner.nextLine();
        list.add(row);
        }
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        if(list.contains(searchedFor)){
            System.out.println("Found!"); 
        } else System.out.println("Not found.");
        
        
    }catch(Exception e){
        System.out.println("Reading the file "+e+" failed."); 
    }
        
        
       

    }
}
