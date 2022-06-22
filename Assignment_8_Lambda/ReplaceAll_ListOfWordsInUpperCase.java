import java.util.ArrayList;
import java.util.List; 

/**
 * ReplaceAll_ListOfWordsInUpperCase
 */ 

public class ReplaceAll_ListOfWordsInUpperCase {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); 
        list.add("Shashi");
        list.add("Nikita"); 
        list.add("pooja");
        list.add("Raj");
        list.add("Mahesh");
        System.out.println(list);   
        
        list.replaceAll((str) -> (str.toUpperCase()));

        System.out.println(list); 
    }
}