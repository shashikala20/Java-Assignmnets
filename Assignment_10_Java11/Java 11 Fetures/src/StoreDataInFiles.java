import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;


class StoreDataInFiles{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int option, count=1;

        var path="C:\\Users\\SAURRAUT\\Desktop\\Core Java Assignments\\programs\\Core-Java-Programs\\JAVA11-Assignments\\PriceList.txt";
        var path1="C:\\Users\\SAURRAUT\\Desktop\\Core Java Assignments\\programs\\Core-Java-Programs\\JAVA11-Assignments\\TotalPrice.txt";
        String resp="yes";

        do {
            System.out.println("Select your option( 1: Insert New Price, 2: View Purchase, 3: Exit)");
            option=sc.nextInt();
            sc.nextLine();
           
            if(option == 1){
            	int total=0;
            	
                while(resp.equalsIgnoreCase("yes")){
                    System.out.println("Insert price " + count);
                    count++;
                    int price = sc.nextInt();
                    total+=price;
                    try {
                        Files.writeString(Path.of(path),price+ "\n", StandardOpenOption.APPEND);
                        System.out.println("Price Has been saved to the file "); 
                        
                    } catch (IOException e) {
                    	System.out.println(e.getMessage());
                    }	catch(Exception e) {
                    	System.out.println(e.getMessage());
                    }
                    sc.nextLine();
                    System.out.println("Do you want to enter more items? (Yes/No)");
                    resp = sc.nextLine();
                } 
                try {
                Files.writeString(Path.of(path1),total +"\n", StandardOpenOption.APPEND);
                resp = "yes";
                } catch (IOException e) {System.out.println(e.getMessage());
                }	catch(Exception e) {
                	System.out.println(e.getMessage());
                }
            }
            if(option == 2) { 
                try { 
                	 var total1 = Files.readString(Path.of(path1));
                     System.out.print("Total price of all items is : "+total1);
                } catch (IOException e) {System.out.println(e.getMessage());
                }	catch(Exception e) {
                	System.out.println(e.getMessage());
                }
            }
        }while(option != 3);
    }

}