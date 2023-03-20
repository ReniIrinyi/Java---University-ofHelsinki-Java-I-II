/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author renatairinyi
 */
public class GradeStatistics {
    private ArrayList<Integer> points;
     private ArrayList<Integer> passedPoints;
     private ArrayList<Integer> grades;
    int range;
    
    
    public GradeStatistics(int range){
        this.points=new ArrayList<Integer>();
        this.grades=new ArrayList<Integer>();
        this.passedPoints=new ArrayList<Integer>();
        this.range=range;
    }

    public double getPoints(){
    double allPoints=0.0;
          for(int i=0; i<this.points.size(); i++){
          allPoints+=this.points.get(i);
          }
          return allPoints;
    
    }
    
    public double getPassedPoints(){
    double allPoints=0.0;
          for(int i=0; i<this.points.size(); i++){
           if(this.points.get(i)>=this.range){
            allPoints+=this.points.get(i);
           }
          }
          return allPoints;
    
    }

       public void setPoints(int input){
      
           
       if(input<=100 && input >=0){
         this.points.add(input); 
            if(input>=this.range){
                this.passedPoints.add(input);
                
                if(input<60 && input >= 50){
                this.grades.add(1);

                }
                if(input<70 && input >= 60){
                     this.grades.add(2);

                }
                if(input<80 && input >= 70){
                    this.grades.add(3);

                }
                if(input<90 && input >= 80){
                     this.grades.add(4);

                }
                if(input>=90){
                     this.grades.add(5);
                }

                } else if(input<=this.range) {
                       this.grades.add(0);
                     }
}
           }

    public  double getAvrgPoints(){
    return getPoints()/this.points.size();
    }
    
    
    public double getAvrgByPassingGrade(){
        return getPassedPoints()/this.passedPoints.size();
    }

    public double printPassPercentage(){
        return (1.0*this.passedPoints.size()/points.size())*100;
        
    }

    public void printGrade(){
   for(int i=5; i>=0; i--){
       System.out.println(i+": "+printStars(i));
   }   
 }
    
    private String printStars(int countOfStars){
        String stars="";
        for(int i=0; i<this.grades.size(); i++){
            if(this.grades.get(i)==countOfStars){
                stars+=("*");
              }
        }
        return stars;
    }
        @Override
        public String toString(){
         System.out.print("grades: "+this.grades);
               return "grades: "+this.grades;
        }
}
