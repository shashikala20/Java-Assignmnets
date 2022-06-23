
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
 

/**
 * NewsMain
 */
public class NewsMain {

  public static void main(String[] args) {
    List<News> newsList = Arrays.asList(new News(100, "Saurabh Raut", "Asim", "it's a news about Indian politics"),
    new News(101, "Rajnikanth", "Amar", "I watched your movie"),
    new News(101, "Akshay Kumar", "Rajesh", " Your movies are of low Budget"),
    new News(103, "Lakshya", "Mahesh", "Your movies are very funny and low Budget"),
    new News(101, "Mahesh babu", "Jr NTR", "it's remake of some movie and must be of minimal Budget"),
    new News(104, "Akshay Kumar", "Rajesh1", " Your movies are of low Budget"),
    new News(101, "Akshay Kumar", "Rajesh2", " Your movies are of minimal Budget")
     
    ); 

    int count = (int) newsList.stream()
						.filter(x-> x.getComment().contains("Budget"))
						.count();

		System.out.println(count);


       //
       Optional<News> max1 = newsList.stream() 
       .collect(Collectors.maxBy(Comparator.comparing(News::getNewsId)));
       
       System.out.println(max1.get());

       //6
       Optional<String> max = newsList.stream().map(x->x.getCommentByUser())
			 			.max((i,j)->i.compareTo(j));
			 System.out.println(max.get());



       //7
       newsList.stream().map(x->x.getCommentByUser())
			.sorted()
			.forEach(System.out::println);

  } 
}