/**
 * Candy
 * 
 * doller = 60rs
 */
public class Candy extends DessertItem {

    private double weight;
    private double pricePerPound;
  
    public Candy(String name, double weight, double pricePerPound) {
        super(name);
        this.weight = weight;
        this.pricePerPound = pricePerPound;
    } 
    public double getWeight() {
        return weight;
    } 
    public void setWeight(double weight) {
        this.weight = weight;
    } 
    public double getPricePerPound() {
        return pricePerPound;
    } 

    public void setPricePerPound(double pricePerPound) {
        this.pricePerPound = pricePerPound;
    } 

    @Override
    void getCost() {
        double total = weight*pricePerPound;
        System.out.println("Candy price is " + total);
    }
    
}