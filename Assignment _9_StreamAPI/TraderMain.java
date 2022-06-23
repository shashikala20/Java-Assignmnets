import java.util.ArrayList; 
import java.util.List;

/**
 * TraderMain
 */
public class TraderMain {

    public static void main(String[] args) {
        List<Trader> list= new ArrayList<>();
				list.add(new Trader("Iron Man", "Pune"));
				list.add(new Trader("Thor", "Bangalore"));
				list.add(new Trader("Hulk", "Pune"));
				list.add(new Trader("Captain", "Delhi") );
				list.add(new Trader("Shaktiman", "Ahmednagar") );

                 

                //Question 9
		list.stream().map(x-> x.getCity()).distinct().forEach(System.out::println);
        System.out.println();
        
        //Question 10
		list.stream().filter(x->x.getCity().contains("Pune")).map(x->x.getName()).sorted()
		.forEach(System.out::println);



    }
}