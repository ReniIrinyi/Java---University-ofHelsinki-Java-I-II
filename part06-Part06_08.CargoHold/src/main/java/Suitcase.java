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
public class Suitcase {
   private ArrayList <Item> items;
   private int max;

    public Suitcase(int max){
         items=new ArrayList<>();
         this.max=max;
    }
    
    public void addItem(Item item){
   int suitcaseWeight = 0;
        for (Item i : items) {
            suitcaseWeight += i.getWeight();
        }
        if ((this.max - suitcaseWeight) >= item.getWeight()) {
            this.items.add(item);
        }
    }

    
    
    @Override
    public String toString(){
        return items.size()>0 ? items.size()+" item" +(items.size()<2?  " ": "'s ")+
        "("+ this.totalWeight() +" kg" +")" : "no items (0 kg)";
        
    }
    
    public void printItems(){
          for(Item w:items){
              System.out.println(w);;
      }
    }
    
    public int totalWeight(){
     int current=0;
        for(Item w:items){
          current+=w.getWeight();
          
      }
        return current;
    }
    
    public Item heaviestItem(){
        if(items.isEmpty()){
        return null; 
        }
        Item current=new Item("",0);
        for(Item element:items){
            current= element.getWeight()>current.getWeight() ? element : current;
        }
                return current;

    }
    
}
