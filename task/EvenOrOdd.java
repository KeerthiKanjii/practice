package task;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
/*int a = 4;
int b= 5;
if(a%2==0||b%2==0) {
	System.out.println("odd");
}else {
	System.out.println("even");
}*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the value of a");
		
		int a = input.nextInt();
		System.out.println("enter the b value");
		int b = input.nextInt();
		
		if(a%2==0||b%2==0) {
			System.out.println("number is even" + "" +a);
		}
		else {
			System.out.println("number is odd" + ""+b);
		}
		
	}

}
