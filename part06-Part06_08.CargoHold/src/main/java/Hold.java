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
public class Hold {
    private int max;
    private ArrayList <Suitcase> suitcases;
    
    public Hold(int max){
        this.max=max;
        suitcases=new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        int max=0;
        for(Suitcase i:suitcases){
            max+=i.totalWeight();
        }
        
        if(suitcase.totalWeight()<=this.max-max){
            suitcases.add(suitcase);
        }
    }
    
    @Override
    public String toString(){
        int total=0;
       for(Suitcase s:suitcases){
           total+=s.totalWeight();
       }
        return suitcases.size()+" suitcases ("+total +"kg)";
    }
    
    public void printItems(){
     
     for(int i=0; i<suitcases.size(); i++){
         suitcases.get(i).printItems();
     }
        }
    
}
