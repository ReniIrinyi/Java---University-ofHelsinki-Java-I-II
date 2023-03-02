
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        String output="";
        String abc="";
        
        if(this.elements.isEmpty()){
        output="The collection " +this.name+ " is empty.";
         
        } else {
            for(String element:this.elements){
                    abc=abc+element+"\n";
               }
            output="The collection " +this.name+ " has "+this.elements.size()+ 
            " element"+(this.elements.size()>1?"s:":":")+"\n" +abc+"\n";
        
      
        }
        return output;
    }
    
}
