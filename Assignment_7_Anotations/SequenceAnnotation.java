import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

/**
 * SequenceAnnotation
 */
public class SequenceAnnotation {

    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        Myclass m=new Myclass();
		Method m1=m.getClass().getMethod("mymethod1");
		Method m2=m.getClass().getMethod("mymethod2");
		Method m3=m.getClass().getMethod("mymethod3");
		Execute e1=m1.getAnnotation(Execute.class);
		Execute e2=m2.getAnnotation(Execute.class);
		Execute e3=m3.getAnnotation(Execute.class);
        System.out.println(e1.sequence()); 
        System.out.println(e2.sequence());
        System.out.print(e3.sequence());  

    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Execute
{
	int sequence();
}

class Myclass
{
	@Execute(sequence=2)
    public void mymethod1()
	{
		System.out.print("order2");
	}
	@Execute(sequence=1)
	public void mymethod2()
	{
		System.out.print("order1");
	
	}
    @Execute(sequence=3)
	public void mymethod3()
	{
		System.out.print("order3");
	
	}
}
