abstract class Bank{    
    abstract int getRateOfInterest();    
    abstract String getDetails();
    }    
    class SBI extends Bank{    
    int getRateOfInterest(){return 7;}   
    String getDetails(){ return "BOM";} //getDetails must be implemented 
    }    
    class PNB extends Bank{    
    int getRateOfInterest(){return 8;}  
    String getDetails(){ return "SBI";}  
    
    }    
        
    class Main{    
    public static void main(String args[]){    
    Bank b;  
    b=new SBI();  
    System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
    b=new PNB();  
    System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    

    // Bank b1 = new Bank() ; // Cannot instantiate  Error 


    }}