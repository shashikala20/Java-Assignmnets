import java.util.Scanner; 
/**
 * AverageScoreOfStudents
 */
public class AverageScoreOfStudents {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = 3;  //no of students / subject 
        String name[] =new String[n];
        int marks[][] =new int[n][n];

        for(int i=0;i<n;i++){
            System.out.print("Enter the Name : ");
            name[i] = sc.next(); 
                System.out.print("Enter Marks of A : ");
                marks[i][0] = sc.nextInt(); 
                System.out.print("Enter Marks of B : ");
                marks[i][1] = sc.nextInt();
                System.out.print("Enter Marks of C : ");
                marks[i][2] = sc.nextInt();
        } 
        for(int i = 0;i<n;i++){ 
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            float averageMarks = totalMarks/3;

            System.out.println("name : "+name[i]); 
            System.out.println("Total marks scored is "+totalMarks +" and average is "+averageMarks);
        }

     }
}