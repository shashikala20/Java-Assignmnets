import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer; 

/**
 * StringUsingFirstLetterOfEachWord
 */
public class StringUsingFirstLetterOfEachWord {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); 
        list.add("Shashi");
        list.add("Nikita"); 
        list.add("Pooja");
        list.add("Raj");
        list.add("Mahesh");
        System.out.println();


        StringBuilder str = new StringBuilder() ;
        
        Consumer<String> consumer = (string1)-> { 
            char ch = string1.charAt(0);
            str.append(ch); 
        } ; 

        for (String string : list) {
        consumer.accept(string);  
        }

        System.out.println(str);
    }

        
}