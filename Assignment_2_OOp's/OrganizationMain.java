class Employee{
    int Salary;
    Employee(){
        Salary = 0;
    }
    Employee(int Salary){
        this.Salary = Salary;
    }
    int getSalary(){
        return Salary;
    }
}
class Manager extends Employee{
    //incentive
    int incentive ;;
    Manager(){
        incentive=0;
    }
    Manager(int Salary,int incentive){
        super(Salary);
        this.incentive = incentive;
    }
    int getSalary(){
        return (super.getSalary()+incentive);
    }
}
class Labour extends Employee{
    // overtime
    int overtime ;
    Labour(){
        overtime=0;
    }
    Labour(int Salary,int overtime){
        super(Salary);
        this.overtime = overtime;
    }
    int getSalary(){
        return (super.getSalary()+overtime);
    } 
} 
public class OrganizationMain {
    public static void main(String[] args) {

        Manager m1 = new Manager(1000,300);
        Manager m2 = new Manager(3000,900);

        Labour l1 = new Labour(500,100);
        Labour l2 = new Labour(700,200);

        // print the totla salary of manager and employee
        System.out.println("m1 : "+m1.getSalary());
        System.out.println("m2 : "+m2.getSalary());
        System.out.println("l1 : "+l1.getSalary());
        System.out.println("l2 : "+l2.getSalary());
        
    }
}
