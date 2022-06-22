import java.util.Arrays;
import java.util.List;
import java.util.Scanner; 

/**
 * ArithmeticException
 */
public class ArithmeticException {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first value");
            int a = sc.nextInt();
            System.out.println("Enter the first value");
            int b = sc.nextInt();
            int c = a/b;
            System.out.println("Result = " + c); 

            //Q 2 
            String array[] = {"a", "b", "c"};
            List<String> list = Arrays.asList(array);
            list.add("d"); 
        
        }
        catch (java.lang.ArithmeticException e)
        {
            System.out.println("Cannot divide the number by zero");
        }  catch (UnsupportedOperationException e) {
            System.out.println("Unsupported Operation Exception occurs");
        }

        // try {
        //     String array[] = {"a", "b", "c"};
        //     List<String> list = Arrays.asList(array);
        //     list.add("d"); 
        // } catch (UnsupportedOperationException e) {
        //     System.out.println("Unsupported Operation Exception occurs");
        // }

    }
    
}