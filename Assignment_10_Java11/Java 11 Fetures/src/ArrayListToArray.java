
import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListToArray {
    public static void main(String[] args) {
        String s="A quick brown fox jumps over the lazy dog";
 // String to ArrayList
        ArrayList<String> words = new ArrayList<>(Arrays.asList(s.split(" ")));
        System.out.println(words); 
        
   //ArrayList to array
      String[] arr=words.toArray(String[]::new);

      System.out.println(Arrays.toString(arr));
  }
}
