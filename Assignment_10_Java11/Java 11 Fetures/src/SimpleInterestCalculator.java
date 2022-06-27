

@FunctionalInterface
interface Interest{
     double SICalculator(Double p, Double r , Double t);
}


public class SimpleInterestCalculator {

    public static void main(String[] args) {
        double principle=600000;
        double rate=8.5;
        double time=2; 
	        Interest i=(p, r, t)->(p*r*t)/100;
	        System.out.println(i.SICalculator(principle,rate,time));

    }
}