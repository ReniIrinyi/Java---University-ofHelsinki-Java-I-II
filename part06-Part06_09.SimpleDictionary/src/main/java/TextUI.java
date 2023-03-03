/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author renatairinyi
 */
public class TextUI {
    private Scanner scan; 
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scan, SimpleDictionary dictionary){
        this.scan=scan;
        this.dictionary=dictionary; 
}   
    
    public void start(){
        while(true){
        System.out.println("Command:");
        String command=scan.nextLine(); 
        if(command.contains("end")){
            System.out.println("Bye bye!");
            break;
        } if(command.contains("add")){
            System.out.println("Word");
            String word=scan.nextLine(); 
            System.out.println("Translation");
            String translation=scan.nextLine(); 
            dictionary.add(word, translation);
        } if(command.contains("search")){
            System.out.println("To be translated");
            String word=scan.nextLine(); 
            if(dictionary.translate(word)!=null && (!(dictionary.translate(word).isEmpty())) ){
                System.out.println("Translation: "+dictionary.translate(word));
            } else System.out.println("Word "+word+" was not found" );
            
        }
  
        else System.out.println("Unknown command");
    }
            }

}
