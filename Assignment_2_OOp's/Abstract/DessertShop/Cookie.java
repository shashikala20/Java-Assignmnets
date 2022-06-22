/**
 * Cookie
 * euro = 70rs
 */
public class Cookie extends DessertItem{ 
    private int quentity;
    private double pricePerDozen; 
    
        public Cookie() { 
            super();
            quentity=0;
            pricePerDozen=0;
    } 
        public Cookie(String name, int quentity, double pricePerDozen) {
        super(name);
        this.quentity = quentity;
        this.pricePerDozen = pricePerDozen;
    } 
    
        public int getQuentity() {
            return quentity;
        }
        public void setQuentity(int quentity) {
            this.quentity = quentity;
        }
        public double getPricePerDozen() {
            return pricePerDozen;
        }
        public void setPricePerDozen(double pricePerDozen) {
            this.pricePerDozen = pricePerDozen;
        }
        @Override
        void getCost() {
            double total = pricePerDozen/12 *quentity;
            System.out.println("Cooke price is : "+total);
        }
    
}