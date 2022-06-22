public class DatabasePersistence extends Persistence{ 
	@Override
	void persist() {
		System.out.println("Data saved in database");
	} 
}
