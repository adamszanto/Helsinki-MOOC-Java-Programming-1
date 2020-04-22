
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {-1, 3, 1, 7, 4, 5, 2, 4, 3};
        
        System.out.println(MainProgram.indexOfSmallestFrom(numbers,7));
        
    }
    
    public static int smallest(int[] array) {
            int smallest = array[0];
            for(int i = 0; i < array.length; i++) {
                if(array[i] < smallest) {
                    smallest = array[i];
                }
            }
            
            return smallest;
        }
    
    public static int indexOfSmallest(int[] array) {
            int smallest = array[0];
            int index = 0;
            
            for(int i = 0; i < array.length; i++) {
                if(array[i] < smallest) {
                    smallest = array[i];
                }
            }
            
            for(int i = 0; i < array.length; i++) {
                if(array[i] != smallest) {
                    index++;
                    continue;
                } else {
                    break;
                }
            }
            return index;
        }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
            int smallest = table[startIndex];
            int index = 0;
            
            for(int i = startIndex; i < table.length; i++) {
                if(table[i] < smallest) {
                    smallest = table[i];
                }
            }
            
            for(int i = startIndex; i < table.length; i++) {
                if(table[i] != smallest) {
                    index++;
                    continue;
                } else {
                    break;
                }
            }
            return index + startIndex;
        }
    
    public static void swap(int[] array, int index1, int index2) {
        
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        
    }
    
    public static void sort(int[] array){  
        for(int i = 0; i < array.length; i++) {
            int index = i;
            
            for(int j = i+1; j < array.length; j++) {
                if(array[j] < array[index]) {
                    index = j;
                }
            }
            
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
            
        }
      
    }  
}
