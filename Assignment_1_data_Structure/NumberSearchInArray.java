import java.util.Scanner;
public class NumberSearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no : ");
        int no = sc.nextInt();
        sc.close();
        int numbers[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        boolean found = false;
        for (int i : numbers) {
            if(no == i)
                found = true;
        }
        if(found){
            System.out.println(no+ " is present");
        }else{
            System.out.println(no+ " is not present");
        }
    }
}
