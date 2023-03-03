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
public class UserInterface {
    private TodoList list;
    private Scanner scan;
    
    public UserInterface(TodoList list, Scanner scan){
        this.list=list;
        this.scan=scan;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String command=scan.nextLine();
            
            if(command.equalsIgnoreCase("add")){
                System.out.println("To add: ");
                String toAdd=scan.nextLine();
                this.list.add(toAdd);
            }
            
            if(command.equalsIgnoreCase("remove")){
                System.out.println("Which one is removed? ");
                int toRemoveInt=Integer.parseInt(scan.nextLine());
                this.list.remove(toRemoveInt);
                }
            
           if(command.equalsIgnoreCase("list")){
               this.list.print();
           }
           
           if(command.equalsIgnoreCase("stop")){
           break;
           }
            
        }
    }
}
