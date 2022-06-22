import java.util.HashMap;
import java.util.Map; 
 

/**
 * MapKeyValueInString
 */
public class MapKeyValueInString {

    public static void main(String[] args) {
        
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");

        System.out.println(map.keySet());
        StringBuilder sb = new StringBuilder(); 
        for (java.util.Map.Entry<Integer, String> value: map.entrySet()) 
		{
			sb.append(value);
		}

        System.out.println(sb);
    }
}