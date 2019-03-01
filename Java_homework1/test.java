package Java_homework1;

public class test {
	public static void main(String[] args) {
		singleton test1=singleton.getsingle();
		singleton test2=singleton.getsingle();
		if(test1==test2){
			System.out.println("single");
		}
	}
}
