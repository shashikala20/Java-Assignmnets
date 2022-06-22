/**
 * BankAccount
 * saving account  - Fixed deposite
 * current account - cash credit
 */
 
class BankAccount {
    private String name;
    private double balance;
    public BankAccount(){
        name= "";
        balance = 0;
    }
    
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    } 
}

class CurrentAccount extends BankAccount {
    double cashCredit; 
    public CurrentAccount(){
        cashCredit=0;
    }
    public CurrentAccount(String name, double balance, double cashCredit) {
        super(name, balance);
        this.cashCredit = cashCredit;
    } 
    public double getBalance() {
        return (super.getBalance()+cashCredit);
    }
}

class SavingsAccount extends BankAccount {
    double fixedDeposit;
    public SavingsAccount(){
        fixedDeposit = 0;
    }

    public SavingsAccount(String name, double balance, double fixedDeposit) {
        super(name, balance);
        this.fixedDeposit=fixedDeposit;
    }
    public double getBalance() {
        return (super.getBalance()+fixedDeposit);
    }
}
public class BankAccountMain{

        public static void main(String[] args) {
            SavingsAccount SA1 = new SavingsAccount("Saurabh",5000,10000);
            CurrentAccount CA1 = new CurrentAccount("Abhishek",10000,4000);

            System.out.println(SA1.getBalance());
            System.out.println(CA1.getBalance());
            
            
        }
    }