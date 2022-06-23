import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * FruitMain
 */
public class FruitMain {

    public static void main(String[] args) {
        
        List<Fruit> fruitsList=Arrays.asList(new Fruit("Mango",99, 90,"Yellow"),
		new Fruit("Apple", 95, 30, "Red"),
	    new Fruit("Strawberry", 25, 10,"Red"),
		new Fruit("Cherry", 10, 10, "Red"),
		new Fruit("Grapes", 15, 20, "Green"),
        new Fruit("Banana", 110, 10, "Yellow"));

        // sort caloriew < 100
        List<Fruit>sortedList=fruitsList.stream().sorted(Comparator.comparingInt(Fruit::getCalories).reversed()).collect(Collectors.toList());
		System.out.println("Fruits with calories<100 are:");
		sortedList.forEach(System.out::println);


        // sort using color 
        List<Fruit> colorList=fruitsList.stream().sorted(Comparator.comparing(Fruit::getColor)).collect(Collectors.toList());
		System.out.println("Colorwise sorting of fruits is:");
		colorList.forEach(System.out::println);

        List<Fruit> colorRedList =fruitsList.stream().filter(ele -> ele.getColor().contains("Red")).sorted(Comparator.comparing(Fruit::getPrice)).collect(Collectors.toList());
        System.out.println("Colorwise sorting of Red color fruits fruits is:");
		colorRedList.forEach(System.out::println);




    }
}