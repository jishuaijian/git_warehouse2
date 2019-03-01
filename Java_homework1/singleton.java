package Java_homework1;

public class singleton {
	private static singleton singleObject=new singleton();
	private singleton(){
	}
	public static singleton getsingle(){
		return singleObject;
	}
}
