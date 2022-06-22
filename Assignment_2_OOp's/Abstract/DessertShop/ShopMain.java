import java.util.Scanner;

//import javafx.scene.transform.Scale;

/**
 * ShopMain
 */
public class ShopMain {

    public static void main(String[] args) {
        int role =0;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Enter the role : 1 : Owner   2 : Customer"  );
        System.out.println("Enter 0 to exit");
         role = sc.nextInt(); 
        if(role==1){
            int itemId = 0;
            do{
            System.out.println("Add Dessert Item");
            System.out.println("1 : Add candy");
            System.out.println("2 : Add Cookie");
            System.out.println("3 : Add IceCream");
            System.out.println("Enter 0 to exit");
             itemId = sc.nextInt();
            switch(itemId){
                case 1 :
                    DessertItem candy1 = new Candy("peanut Butter", 2, 4.2);
                    System.out.println("Candy inserted");
                    continue;
                case 2 :
                    DessertItem cookie1 = new Cookie("Cookies",4,4.99);
                    continue;
                case 3 :
                    DessertItem iceCream1 = new IceCream("Venilla", 2, 10);
                    continue;
                default :
                    System.out.println( "Wrong choice selected");

                }

                System.out.println("DATA ADDED SUCCESSFULL"+role);
            }while(itemId!=0);
        }
        else if(role==2){
            System.out.println("Welcome Shopping ");
            System.out.println();


        }
        }while(role!=0); 
        
        }
}

