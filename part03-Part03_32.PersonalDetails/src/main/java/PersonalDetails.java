
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names=new ArrayList<>();
        ArrayList<Integer> ages=new ArrayList<>();
        double avg=0;
        String currentName="";
        
        while(true){
        String input=scanner.nextLine();
        
            
            if(input.equals("")){
            break;
            }
             
            
        String [] strings=input.split(",");
        names.add(strings[0]);
        ages.add(Integer.valueOf(strings[1]));
        
        if(names.size()<1){
            break;
        }
        int sum=0;
        for(int i=0; i<ages.size(); i++){
            sum+=ages.get(i);
        }
        avg=1.0*sum/ages.size();
        currentName=names.get(0);
        for(int name=0; name<names.size(); name++){
       if(names.get(name).length() > currentName.length()){
           currentName=names.get(name);
       }

        };
  
        }
            
        
        System.out.println("Longest name: "+currentName);
        System.out.println("Average of the birth years: "+avg);
    }
}
