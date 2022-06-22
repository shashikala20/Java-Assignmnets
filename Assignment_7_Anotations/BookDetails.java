import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * BookDetails
 */
public class BookDetails {

    public static void main(String[] args) {
        Information i=new Information("extra info");
		Class c = i.getClass();
        java.lang.annotation.Annotation an=c.getAnnotation(info.class);
		info in=(info)an;
		System.out.println(in.Author());
		System.out.println(in.AuthorID());
		System.out.println(in.Date());
		System.out.println(in.Time());
		System.out.println(in.version());
		System.out.println(in.Description());

    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info{
 
    int AuthorID(); 
    String Author() default "Shahikala" ; 
	String supervisor()default "poonam"; 
    String Date(); 
    String Time();
    int version(); 
    String Description() default "Motivational Book";
}


@info(AuthorID=567,Author="Chetan Bhagat",Date="1.12.1999",Time="12:30",version=3)
class Information{
	String extrainfo;

	public Information(String extrainfo) {
		super();
		this.extrainfo = extrainfo;
	}
	
	
}
