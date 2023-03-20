import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
     int[] numbers = {3, 2, 5, 4, 8};

System.out.println(Arrays.toString(numbers));

MainProgram.swap(numbers, 1, 0);
System.out.println(Arrays.toString(numbers));

MainProgram.swap(numbers, 0, 3);
System.out.println(Arrays.toString(numbers));
   
    }
    
    
public  static int smallest(int [] array){
        int min=999;
      
        for(int i=0; i<array.length; i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
     
}

public static int indexOfSmallest(int[] array){
       int index=0;
    for(int i=0; i<array.length; i++){
       if(array[i]==smallest(array)){
           index= i;
       }
       
       };
    return index;
}


public static int indexOfSmallestFrom(int[] table, int startIndex){
 int index=startIndex;
 int [] current= new int[table.length-index];
 
 for(int j=0; j<current.length; j++){
     current[j]=table[index];
     index++;
     
 }
   
 return startIndex+ indexOfSmallest(current);
 
}


public static void swap(int [] array, int index1, int index2){
        int [] newArray=new int[array.length];
        for(int i=0; i<array.length; i++){
            newArray[i]=array[i];
        }
        array[index1]=newArray[index2];
        array[index2]=newArray[index1];
    }


public static void sort(int []array){

   for(int j=0; j<array.length; j++){
       
 swap(array, j,indexOfSmallestFrom(array,j)) ;

}

}



}