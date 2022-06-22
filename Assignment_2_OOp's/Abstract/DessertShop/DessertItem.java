/**
 * DessertItem
 */
public abstract class DessertItem {
    private String name; 
    
    public DessertItem() {
        super();
        name = "";
    }
    

    public DessertItem(String name) {
        this.name = name;
    } 
    public String getName() {
        return name;
    }  
    public void setName(String name) {
        this.name = name;
    }
 
    abstract void getCost();
}