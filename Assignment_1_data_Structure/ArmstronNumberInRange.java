package Assignmnet1;
import java.util.ArrayList;

/**
 * ArmstronNumberInRange
 */ 
public class ArmstronNumberInRange { 
    public static int cube(int number) {
        return number*number*number;
    } 
    static boolean checkArmstrong(int n) {
        int sum = 0;
        int no = n;
        while(no>0){
            int temp = no%10;
            sum += cube(temp);
            no= no/10;
            
        }
        if(sum == n){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

        int start =100,end =999;
        ArrayList <Integer> ArmstrongNumbers =  new ArrayList<Integer>();  
        for(int i = start;i<=end;i++){
            boolean res = checkArmstrong(i);
            if(res){
                ArmstrongNumbers.add(i);
            }
        }

        for (Integer integer : ArmstrongNumbers) {
            System.out.print(integer+" "); 
        } 
    }    
}