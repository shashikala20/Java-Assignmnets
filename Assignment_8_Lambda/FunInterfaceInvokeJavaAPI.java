
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * FunInterfaceInvokeJavaAPI
 */ 

public class FunInterfaceInvokeJavaAPI {

    public static void main(String[] args) {
        //accepts only one argument/gentrified arg , does not return anything
	
        Consumer<Integer> consumer = (value) -> System.out.println(value);
        consumer.accept(100);

        //it accepts single arg and return boolean value.
        Predicate predicate = (n)-> n != null ;
        System.out.println(predicate.test(10));
 
        
        Function<Integer,Integer> function = (n) -> ++n;
        System.out.println(function.apply(100));

        UnaryOperator<Integer>  unaryOpe = (n) -> --n ;
        System.out.println(unaryOpe.apply(100));

        //does not take any args / returns single result
        Supplier supplier = ()-> "supplier";
        System.out.println(supplier.get());
        
    }
}