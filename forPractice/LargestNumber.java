package forPractice;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter the number");
int a = input.nextInt();
int b = input.nextInt();
int c = input.nextInt();

if(a>b) {
	System.out.println("a is larger");
	
}else if(a>c) {
	System.out.println("c is larger");
}else if(b>c) {
	System.out.println("b is larger");
}

	}

}
