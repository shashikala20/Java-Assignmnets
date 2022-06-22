import java.util.Scanner;
import java.util.TreeSet;

/**
 * Employee
 */
public class Employee { 
    private int id;
	private String name;
	private String department;
	private int salary;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
 

    public String displayDetails() {
        return "department =" + department + ", id=" + id + ", name=" + name + ", salary=" + salary ;
    } 
    public static void main(String[] args) { 

        TreeSet<Employee> emp = new TreeSet<>(new IdComprare()); 

        emp.add(new Employee(10,"Saurabh","IT",1000));
        emp.add(new Employee(11,"Abhi","Management",4500));
        emp.add(new Employee(12,"Aniket","HR",2700));
        emp.add(new Employee(13,"Pritee","Management",1000));
        emp.add(new Employee(14,"Rutu","HR",3000));
        emp.add(new Employee(16,"Riya","Training",2700));
        emp.add(new Employee(15,"Raj","IT",7800));
        emp.add(new Employee(19,"neeta","IT",2900));
        emp.add(new Employee(17,"Bhakti","HR",1900));
        emp.add(new Employee(18,"Ashu","Management",1700));
         
        for(Employee e:emp)
        {
            System.out.println(e.displayDetails());
        }
    }

}