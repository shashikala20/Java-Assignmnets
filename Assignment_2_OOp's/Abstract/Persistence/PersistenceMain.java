/**
 * PersistenceMain
 */
public class PersistenceMain {
 
	public static void main(String[] args) {		
		Persistence p1= new FilePersistence(); 
		p1.persist();
        Persistence p2= new DatabasePersistence(); 
		p2.persist();
	}
}