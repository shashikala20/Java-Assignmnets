import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

/**
 * methodAnnotation
 */
public class methodAnnotation {
    
    @Test
    public static Void method1(){
        System.out.println("it's method one");
        return null;
    }

    @Test 
    public Void method2(){
        System.out.println("it's method two");
        return null;
    }
 
    public static void main(String[] args) {
        System.out.println(method1());

        methodAnnotation obj = new methodAnnotation();
        System.out.println(obj.method2());
    }
}
 
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test
{

    // String type() default "does not return anything";
	
}