package task;

import java.util.Scanner;

public class PositiveOrNegitive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int a = input.nextInt();
		if(a>=0) {
			System.out.println("it is positive number");
			
		}else {
			System.out.println("it is a negitive number");
		}
	}

}
