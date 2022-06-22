 
public class Contact implements Comparable<Contact>{
    long phoneNo;
    String name;
    String email;
    private Contact.Gender gen; 
    enum Gender{
        Male,Female,Others
    }
    @Override
    public int compareTo(Contact obj) {
      return Long.compare(this.phoneNo, obj.phoneNo);
    }
    public Contact(long phoneNo, String name, String email, Contact.Gender gen) {
        this.phoneNo = phoneNo;
        this.name = name;
        this.email = email;
        this.gen = gen;
    }
    @Override
    public String toString() {
        return "Contact [email=" + email + ", gen=" + gen + ", name=" + name + ", phoneNo=" + phoneNo + "]";
    } 
}