/**
 * Transaction
 */
public class Transaction {

    Trader trader;
	int year;
	int value;
    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "Transaction [traderName=" + trader.getName() +"traderCity = " + trader.getCity() +"+ value=" + value + ", year=" + year + "]";
    }  
    

}