
public class Statistics {
    private int count=0;
    private int sum=0;

    public void addNumber(int number){ 
    this.count+=1;
    this.sum+=number;
    }
    
    public int getCount(){
    return this.count;
    }
    
    public int sum(){
        return this.sum;
    }
    
    public double average(){ 
    if(sum()==0){
    return 0;
    }return 1.00*this.sum/this.count;
    } 


    
}
