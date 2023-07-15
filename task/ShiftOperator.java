package task;

import java.util.Scanner;

public class ShiftOperator {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter value a:");
int a = input.nextInt();
System.out.println(a<<5);
System.out.println("enter value b:");
int b =input.nextInt();
System.out.println(b>>5);

	}

}
