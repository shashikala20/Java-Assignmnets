import java.util.Scanner;

/**
 * Atm
 */
public class Atm { 
    double balance= 2000.00;
        long id=98765;  
        Scanner sc =new Scanner(System.in);
        public void savingsaccount()  {
            int choice ;
            do{ 
            System.out.println("account Id "+id);
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Enter 0 to Exit.");
            choice=sc.nextInt();
            
                try {
                    if(choice==1){ 
                        System.out.println("enter withdraw amount");
                        double amount= sc.nextDouble();
                        withdraw(amount);
                    }
                    if(choice==2) {
                        System.out.println("enter deposit amount");
                        double amount=sc.nextDouble();
                        deposit(amount);
                    }
                }
                catch(InsufficientBalanceException e) {
                    System.out.println(e);}
                catch(IllegalBankTransactionException e) {
                    System.out.println(e);
                }
            }while(choice!=0);   
        }
        public void withdraw(double amount) throws InsufficientBalanceException,IllegalBankTransactionException
        {
            if(amount<0) {
                throw new IllegalBankTransactionException("enter valid amount");
            }else if(amount>balance)
            {
                throw new InsufficientBalanceException("insufficient balance enter less amount");
            }else{
                balance = balance-amount;
                System.out.println("current balance "+balance);
                System.out.println();
            }
        }
              
        public void deposit(double amount) throws IllegalBankTransactionException
        {
            if(amount<0) {
                throw new IllegalBankTransactionException("enter valid amount");
            }else{
                balance += amount;
                System.out.println("current balance "+balance);
                System.out.println();
            } 
        }
        
    class IllegalBankTransactionException extends Exception{
        public IllegalBankTransactionException(String msg) {
            super(msg);
        } 
    }
    class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String msg) {
            super(msg);
        } 
    }

    
    public static void main(String[] args) {
        Atm at=new Atm();
        at.savingsaccount(); 
    }

}

