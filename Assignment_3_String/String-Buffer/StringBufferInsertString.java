/**
 * StringBufferInsertString
 */
public class StringBufferInsertString {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("It is used to _ at the specified index position");
        str.insert(str.indexOf("_"),"insert text");
        System.out.println(str);

    }
}