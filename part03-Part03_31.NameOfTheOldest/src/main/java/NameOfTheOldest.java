
import java.util.Scanner;
import java.util.ArrayList;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> ages = new ArrayList<>();
        ArrayList <String> names=new ArrayList<>();
     
        while(true){
        
            String input=scanner.nextLine();
            
            
            if(input.equals("")){
             break;
            }
         
        String[] strings=input.split(",");
        names.add(strings[0]);
        ages.add(Integer.valueOf(strings[1]));
        };
   
       String oldest=names.get(0);
       int oldestAge=ages.get(0);
       for(int i=0; i<ages.size(); i++){
           if(oldestAge<ages.get(i)){
                oldestAge=ages.get(i);
                oldest=names.get(i);
                
           }

       }
  
     
       System.out.println("Name of the oldest: " + oldest);  

    }
}
