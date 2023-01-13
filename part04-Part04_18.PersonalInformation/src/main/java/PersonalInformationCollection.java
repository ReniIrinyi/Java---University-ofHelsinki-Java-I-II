
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
       
           
        while(true){
            System.out.println("First Name: ");
            String firstname=scanner.nextLine();
            
                 if(firstname.isEmpty() ){
            break;
            }
                
            System.out.println("Last name: ");
            String lastname=scanner.nextLine();
            System.out.println("Identification number: ");
            String id=scanner.nextLine();
            infoCollection.add(new PersonalInformation(firstname, lastname,id));
        }
    
            for(PersonalInformation infos:infoCollection){
                System.out.println(infos.getFirstName()+" "+infos.getLastName());
        }
     
    }
}
