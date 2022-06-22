import java.util.Scanner;

/**
 * LoginDetailValidation
 */
public class LoginDetailValidation {

    public static String user = "shashi";
    public static String pass = "1010";

    public static boolean isValid(String userName, String password){
        if(userName.equals(user) && password.equals(pass))
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter Login details ");
        Scanner sc = new Scanner(System.in);
        int count=1;
        do{
            System.out.print( "UserName : ");
            String userName = sc.next(); 
            System.out.print("Password : ");
            String password = sc.next();
            if(isValid(userName,password)){
                System.out.println("Welcome "+userName);
                break;
            }else{
                if(count==3)
                  {  System.out.println("Contact Admin");
                    break;
                  }
                  System.out.println("Invalid Details");
         }
         count++;
        } while(true);
    }
}