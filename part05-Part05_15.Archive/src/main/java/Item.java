/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author renatairinyi
 */
public class Item {
    private String name;
    private String identifier;
    
  
   public Item(String id, String name){
    this.name=name;
    this.identifier=id;
    
    
    }
   
   public String toString(){
   return this.identifier +": " +this.name; 
   }
   
    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (compared instanceof Item) {
            Item itemCompared = (Item) compared;
            if (this.identifier.equals(itemCompared.identifier)) {
                return true;
            }
        }

        return false;
    }

   
}
