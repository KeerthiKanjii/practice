package forPractice;

import java.util.Scanner;

public class AgeCalculation {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter age");
int age = input.nextInt();
if(age<=18) 
	System.out.println("You are a minor");

if(age>18 && age<65) 
	System.out.println("You are an adult");

	if(age>=65) 
		System.out.println("You are a senior citizen");
	
}
	}


