/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author renatairinyi
 */
public class Room {
    private ArrayList<Person> persons;
    
    public Room(){
        persons=new ArrayList<>();
    }
    
    public void add(Person person){
        persons.add(person);
    }
    
    public boolean isEmpty(){
        return this.persons.isEmpty()? true : false;
    }
    
    public ArrayList <Person> getPersons(){
        return persons; 

    }
    
    public Person shortest(){
       
        if(this.isEmpty()){
            return null; 
        } 
         Person current=this.persons.get(0); 
            for(int i=0; i<persons.size(); i++){
                if(current.getHeight()>persons.get(i).getHeight()){
                    current=persons.get(i);
                }
            
        }
        return current;
    }
    
    public Person take(){
       Person current;
        if(this.isEmpty()){    
          return null;
        } else {
           current= this.shortest();
          persons.remove(this.shortest()); 
        }
           return current;
          }
            
        
    
}
