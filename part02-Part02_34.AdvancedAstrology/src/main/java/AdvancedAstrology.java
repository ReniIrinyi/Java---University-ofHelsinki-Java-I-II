
public class AdvancedAstrology {

    public static void printStars(int number) {
        for(int stars=1; stars<=number; stars++){
            System.out.print("*");
        };
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for(int spaces=1; spaces<=number; spaces++){
            System.out.print(" ");
        };
    }

    public static void printTriangle(int size) {
     // for(int s=0; s<=size; s++){
           // printStars(s);
          //printSpaces(size-s);
      //};
        int i = 1;
        int j = size - 1; 
        if(size == 1){
            System.out.print("*");
            System.out.println("");
        }else{
            while (i <= size){
                printSpaces(j);
                printStars(i);
                j--;
                i++;
            }
        }
        
    }

    public static void christmasTree(int height) {

        int i=1;
        while(i<=height){
            printSpaces(height-i);
            printStars(2*i-1);
            i++;
        }
        for(int counter=1; counter<=2; counter++){
            printSpaces(height-2);
            printStars(3);
        } 
    }

 
    

    public static void main(String[] args) {
 
        christmasTree(4);
      
    }
}
