import java.util.Scanner;

/**
 * ResultDeclaration
 */
public class ResultDeclaration {

    public static void main(String[] args) {
        System.out.println("Enter the marks for three subjects : ");
        Scanner sc = new Scanner(System.in);

        int s1 = sc.nextInt(); 
        int s2 = sc.nextInt(); 
        int s3 = sc.nextInt(); 
        if(s1>=60){
            if(s2>=60){
                if(s3>=60){
                    System.out.println("passed");
                }else{
                    System.out.println("promoted");
                }
            }else if(s3>=60){
                System.out.println("Promoted");
            }else{
                System.out.println("Failed");
            }
        }else if(s2>=60){
            if(s3>=60){
                System.out.println("Promoted");
            }else{
                System.out.println("Failed");
            }
        }else{
            System.out.println("Failed");
        }
    }
}