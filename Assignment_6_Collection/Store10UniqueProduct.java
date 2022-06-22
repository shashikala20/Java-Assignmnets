import java.util.HashSet;

/**
 * Store10UniqueProduct
 */
public class Store10UniqueProduct {

    public static void main(String[] args) {
        HashSet <Object> list = new HashSet<>();
       
        list.add("Apple");
        list.add("Banana");
        list.add("Orenge");
        list.add("Tomato");
        list.add("Apple");          // duplicate
        list.add("Samsung");
        list.add("LG");
        list.add("Apple");          // duplicate
        list.add("OnePlus");
        list.add("Nokiya");
        list.add("Jio");
        list.add("Airtel");
        list.add(null);
        
        System.out.println(list);

    }
}