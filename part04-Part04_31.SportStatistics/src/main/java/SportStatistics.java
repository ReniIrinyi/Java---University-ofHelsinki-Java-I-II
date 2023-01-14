
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String team1="";
        String team2="";
        int team1Points=0;
        int team2Points=0;
        int counter=0;
        int win=0;
        int los=0;
        
        System.out.println("File: ");
        String input=scan.nextLine();
        System.out.println("Team: ");
        String inputTeam=scan.nextLine();
        
        try(Scanner datescanner=new Scanner(Paths.get(input))){
            while(datescanner.hasNextLine()){
        
                String rows=datescanner.nextLine();
                String rowSplitted []=rows.split(",");
                team1= rowSplitted[0];
                team2=rowSplitted[1];
                team1Points=Integer.valueOf(rowSplitted[2]);
                team2Points=Integer.valueOf(rowSplitted[3]);

            if(inputTeam.equals(team1)){
                counter++;
                    if(team1Points>team2Points){
                        win++;
                   } else los++;
            } else if(inputTeam.equals(team2)){
            counter++;
                    if(team1Points<team2Points){
                        win++;
                   } else los++;            
            }
            }
             
        System.out.println("Games: "+ counter);
        System.out.println("Wins: "+win);
        System.out.println("Losses: "+los);
                  
   }catch(Exception e){
            System.out.println("Error "+e);
       }
    }
}
