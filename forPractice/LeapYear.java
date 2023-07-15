package forPractice;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
//Write a program to determine whether a given year is a leap year or not. 
		//A leap year is divisible by 4 but not divisible by 100, except if it is also divisible by 400.
		
	Scanner input = new Scanner(System.in);
	System.out.println("enter year");
	int year = input.nextInt();
	if(year%4==0) {
		System.out.println("it is a leap year");
	}
		else {
			System.out.println("it is not a leap year");
			
		}
	}
	}


