import java.util.ArrayList;
import java.util.List;

/**
 * RemoveOddLengthStrings
 */
public class RemoveOddLengthStrings {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Shashi");
        list.add("Akshay");
        list.add("Pooonam");
        list.add("Harshal");
        list.add("Raj");
        list.add("Mahesh");
        System.out.println("Original list"); 
        System.out.println(list);  
        System.out.println("List after removing old lenght words ");
        list.removeIf((str) -> (str.length()%2 !=0));
        System.out.println(list);

    }
}