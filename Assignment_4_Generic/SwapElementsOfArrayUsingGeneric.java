import java.util.Arrays;

/**
 * SwapElementsOfArrayUsingGenerics
 */
public class SwapElementsOfArrayUsingGenerics {
     
    public static final <T> void swap (T[] arrays, int i, int j) {
        T t = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = t;
        }

    public static void main(String[] args) {
        Integer [] arrays = new Integer[] {10,30,40,50};
        swap(arrays, 0, 1);
        System.out.println("a:"+Arrays.toString(arrays));
        swap(arrays, 2, 3);    
        System.out.println("a:"+Arrays.toString(arrays));

            
        // String [] a = {"Hello", "Goodbye"};
        // swap(a, 0, 1);
        // System.out.println("a:"+Arrays.toString(a));

                
        // Double [] arr = {10.00, 20.00};
        // swap(arr, 0, 1);
        // System.out.println("a:"+Arrays.toString(arr));
        
    }
 
}