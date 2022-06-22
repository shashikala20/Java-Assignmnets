class Singleton { 
	private static Singleton instance = null; 
	public String s; 
	private Singleton()             //singletone class have private constructor
	{
		s = "It's Singleton class";
	}
 
	public static Singleton getInstance()
	{
		if (instance == null)
			instance = new Singleton();

		return instance;
	}
} 
// class child extends Singleton{
//     child(){
//         super();        //because of this super keyword we cannot inherite singeltone class
//                         //we can not access private constructor outside that class
//     }
// }
class SingletonMain { 
	public static void main(String args[])
	{ 
		Singleton x = Singleton.getInstance();   
	}
}
