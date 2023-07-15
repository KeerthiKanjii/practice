package day5;

public class SingleThread {

	public static void main(String[] args) {
		System.out.println("a is running");

		for (int i = 1; i <= 10; i++) {
			System.out.println("a is printing");

		}

		System.out.println("a and b is completed");
	}

}
