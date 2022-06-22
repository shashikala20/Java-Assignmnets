import java.util.Comparator;

class IdComp implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getId()>o2.getId())
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
