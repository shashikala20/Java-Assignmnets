import java.util.Comparator;

class DeptComp implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getDepartment().compareTo(o2.getDepartment());
    }
}
