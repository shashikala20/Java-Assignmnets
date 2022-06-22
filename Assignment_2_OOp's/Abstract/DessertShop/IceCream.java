/**
 * IceCream
 * ruppee
 */
public class IceCream extends DessertItem{
    int noOfScoops;
    double pricePerScoop; 
    public IceCream() {
        super();
        noOfScoops=0;
        pricePerScoop=0;
    }
     
    public IceCream(String name, int noOfScoops, double pricePerScoop) {
        super(name);
        this.noOfScoops = noOfScoops;
        this.pricePerScoop = pricePerScoop;
    }
    

    @Override
    void getCost() {
        System.out.println("IceCream price is ");
    }
        
    }