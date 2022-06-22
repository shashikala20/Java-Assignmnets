import java.util.Scanner;

/**
 * IncomeTaxCalculator
 */
public class IncomeTaxCalculator {

    public static void main(String[] args) { 
        System.out.println("Enter the Income amount : ");
        Scanner sc = new Scanner(System.in);
        long Income  = sc.nextLong();
        sc.close();
        System.out.print("Tax Payable is : ");
        if(Income < 180000){
            System.out.println("Nill");
        }else if(Income < 300000) {
                System.out.println((Income*10)/100);
            } else if(Income < 500000){
            System.out.println((Income*20)/100);
        }else{
            System.out.println((Income*30)/100);
        }
    }
}