/**
 * ReveseString_StringBuilder
 */
public class ReveseString_StringBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("This method returns the reversed object on which it was called");
        System.out.print("Orginal String : ");
        System.out.println(sb);
        System.out.print("Reversed String : ");
        System.out.println(sb.reverse());

    }
}