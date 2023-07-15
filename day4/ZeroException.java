package day4;

public class ZeroException {

	public static void main(String[] args) {
		int x = 5;
		int y = 0;
		try {
 y = 20/x;
 }
catch(Exception e) {
System.out.println("error");
	}
System.out.println(y);

}
}