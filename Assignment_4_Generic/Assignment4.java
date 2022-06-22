import java.util.Date;

/**
  * Assignment4
  */ 
class Student <K,V> {
    private K key;
    private V value;
    public Student() {
    }
    public Student(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }
    public void setKey(K key) {
        this.key = key;
    }
    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    } 
    
}


 public class Assignment4 {
 
    public static void main(String[] args) {  
        Student<String, String> student = new Student<>();
        student.setKey("Name");
        student.setValue("Shashikala"); 
        String key = student.getKey();
        String value = student.getValue(); 
        System.out.println(key+" : "+value);


        // Q 2
        Student<String, Date>  std1 = new Student<>();
        std1.setKey("Today is");
        std1.setValue(new java.util.Date());
        String key1 = std1.getKey();
        Date value1 = std1.getValue();
        System.out.println(key1+" : " +value1);

    }
 }