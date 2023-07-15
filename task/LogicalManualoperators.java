package task;

import java.util.Scanner;

public class LogicalManualoperators {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a value");
		int a = input.nextInt();
		System.out.println("enter b value");
		int b= input.nextInt();
		System.out.println("enter c value");
		int c = input.nextInt();
		boolean resultAnd = (a>b) && (a>c) && (b>c);
		
		boolean resultOr = (a>b) || (a>c) || (b>c);
		
		boolean result = (a>b) != (a>c) != (b>c);
		
		System.out.println(resultAnd +" "+resultOr+" "+result);
	}

}
