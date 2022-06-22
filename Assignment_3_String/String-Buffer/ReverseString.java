/**
 * ReverseString
 */
public class ReverseString {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("This method returns the reversed object on which it was called");
		  System.out.print("Orginal String : ");
		  System.out.println(str); 
		  System.out.print("Reverse String : ");
		  System.out.println(str.reverse());

    }
}