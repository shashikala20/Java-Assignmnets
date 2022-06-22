import java.util.Scanner;
import java.util.TreeSet;
 
public class Program3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose between following options:");
        System.out.println("1.ID|2.Name|3.Department|4.Salary");
        int choose=sc.nextInt();
        TreeSet<Employee> emp=null;
        switch(choose)
        {
            case 1: emp=new TreeSet<>(new IdComp());
                    break;
            case 2: emp=new TreeSet<>(new NameComp());
                    break;
            case 3:	emp=new TreeSet<>(new DeptComp());
                    break;
            case 4: emp=new TreeSet<>(new SalComp());
                    break;
            default:System.out.println("Invalid Option");
        }
        emp.add(new Employee(10,"Panu","IT",8000));
        emp.add(new Employee(11,"Abhi","Management",4000));
        emp.add(new Employee(12,"Aniket","HR",2000));
        emp.add(new Employee(13,"Pritee","Management",1000));
        emp.add(new Employee(14,"Rutu","HR",3000));
        emp.add(new Employee(16,"Riya","Training",2700));
        emp.add(new Employee(15,"Raj","IT",7800));
        emp.add(new Employee(19,"neeta","IT",2900));
        emp.add(new Employee(17,"Bhakti","HR",1900));
        emp.add(new Employee(18,"Ashu","Management",1700));
        
        for(Employee e:emp)
        {
            System.out.println(e);
        }
    }
 
}