/**
 * StringOperations
 */
public class StringOperations {

    public static void main(String[] args) {
    
    String str = "java String pool refers to collections of String which are stored in heap memory";
    System.out.println(str.toLowerCase());
    System.out.println(str.toUpperCase());
    System.out.println(str.replace("a", "$"));
    System.out.println(str.contains("collections"));    
    System.out.println(str.equals("java String pool refers to collections of String which are stored in heap memory"));
    String str1 = new String("java String pool refers to collections of String which are stored in heap memory");
    System.out.println(str.equals(str1));   
    }
}