import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * printNumbersUsingThreads
 */
public class printNumbersUsingThreads {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
        
        Consumer<Integer> display = (i)->System.out.println(i);
        new Thread(() -> { 
            for (Integer i : list) {
                display.accept( i); 
            }
         }).start();
           
    }
}