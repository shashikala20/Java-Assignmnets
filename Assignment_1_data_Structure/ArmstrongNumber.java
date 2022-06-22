package Assignmnet1;
  
class ArmstrongNumber{ 
    static int cube(int n) {
        return n*n*n;
    }

    static void checkArmstrong(int n) {
        int sum = 0;
        int no = n;
        while(no>0){
            int temp = no%10;
            sum += cube(temp);
            no= no/10;
            
        }
        if(sum == n){
            System.out.println(n +" is a Armstrong number.");
        }else{
            System.out.println(n +" is not a Armstrong number");
        }
    }

    public static void main(String[] args) {

        //check no is armstrong no or not
        int n = 153; 
        checkArmstrong(n); 
    }
}