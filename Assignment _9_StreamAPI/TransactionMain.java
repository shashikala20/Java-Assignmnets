import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * TransactionMain
 */
public class TransactionMain {

    public static void main(String[] args) {
        
        List<Transaction> list = new ArrayList<>();
        new Transaction(new Trader("Saurabh", "Ahmadnagar"), 2012, 2000);
        list.add(new Transaction(new Trader("Akshay", "Pune"), 2011, 5000));
		list.add(new Transaction(new Trader("Abhishek", "Bangalore"), 2012, 4000));
		list.add(new Transaction(new Trader("Rahul", "Delhi"), 2011, 3000));
		list.add(new Transaction(new Trader("Asim", "Indore"), 2012, 2000));

        //Question 8
        list.stream().filter(x-> x.year==2011).map(x-> x.value).sorted()
		.forEach(System.out::println);
        System.out.println();
        //Question 11
		list.stream().map(x->x.trader.getName())
		.sorted()
		.forEach(System.out::println);
        System.out.println();

        //Question 12
		list.stream().filter(x->x.trader.getCity().contains("Indore"))
		.map(x->x.trader)
		.forEach(System.out::println);
        System.out.println();

        //Question 13
		list.stream().filter(x->x.trader.getCity().contains("Delhi"))
		.map(x->x.value)
		.forEach(System.out::println);
		System.out.println();

        //Question 14
		Optional<Integer> max = list.stream().map(x->x.value).max((i,j)->i.compareTo(j));
        System.out.println(max);

		Integer max2 = list.stream().map(x->x.value).max((i,j)->i.compareTo(j)).get();
        System.out.println(max2);

        //question 15
		Optional<Integer> min = list.stream().map(x->x.value).min((i,j)->i.compareTo(j));

        System.out.println(min.get());


    }
}