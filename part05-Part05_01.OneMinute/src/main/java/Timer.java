/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author renatairinyi
 */
public class Timer {
    private ClockHand hunr;
    private ClockHand sec;
    
    public Timer(){
    this.hunr=new ClockHand(100);
    this.sec=new ClockHand(60);
    }
    
    public void advance(){
      
            this.hunr.advance();
                if(hunr.value()==0){
            this.sec.advance();
            }
  
    
      
}
    public String toString(){
        return sec+":"+hunr;
        }
}


