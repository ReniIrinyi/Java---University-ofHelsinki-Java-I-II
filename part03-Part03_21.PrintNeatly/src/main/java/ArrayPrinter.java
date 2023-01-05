
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5,12,5};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        int counter=0;
        if(array.length <= 1) System.out.print(array[0]);
        else if(array.length >= 1) {
        for(int i=0; i<array.length;i++ ){

            if(i<array.length-1) {
                counter++;
                System.out.print(array[i]+","+" ");
                        };
                     
                      
        }  
        System.out.print(array[counter]);
        }
          
        
    }
}
