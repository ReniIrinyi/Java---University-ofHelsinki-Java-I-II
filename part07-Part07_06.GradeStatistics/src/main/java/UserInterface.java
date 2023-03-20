/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author renatairinyi
 */

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private GradeStatistics statistics;
    
    public UserInterface(){
    this.scanner=new Scanner(System.in);
    this.statistics=new GradeStatistics(50);
    
    }
    
    
    public void start(){
        System.out.println("Enter point totals, -1 stops: ");
         while(true){
        int input=Integer.parseInt(scanner.nextLine());
        if(input==-1){
      
          runstatistics();
          
             break;
        }
          if(input>=0){
       
             statistics.setPoints(input);
           
          }
   
    }
    
}
    
    
    public void runstatistics(){
        System.out.println("Point average (all): "+ statistics.getAvrgPoints() );
        System.out.println("Point average (passing): "+ statistics.getAvrgByPassingGrade());
        System.out.println("Pass percentage: "+ statistics.printPassPercentage());
        statistics.printGrade();
        statistics.toString();
    
    }
    

    
}
