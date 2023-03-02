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
public class Stack {
    ArrayList<String> newList=new ArrayList<>();

    
    public boolean isEmpty(){
        return this.newList.isEmpty() ? true : false;
    }
    
    public void add(String value){
        this.newList.add(value);
    }
    
    public ArrayList<String> values(){
        return this.newList;
    }
    
    public String take(){
        String taked=newList.get(newList.size()-1);
        newList.remove(taked);
        return taked;
    }
    
    
}
