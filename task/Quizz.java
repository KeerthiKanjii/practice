package task;

import java.util.Scanner;

public class Quizz {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int score = 0;
		System.out.println("Welcome to java quizz");
		System.out.println("Q1:what is capital of karnataka");
		System.out.println("a:karnataka");
		System.out.println("b:mysore");
		System.out.println("c:bhopal");
		
		String Answer1 = input.nextLine().toLowerCase();
		if(Answer1.equals("a")) {
			System.out.println("Answer is correct");
			score++;
		}else {
			System.out.println("Answer is incorrect");
		}
		
		System.out.println("Q2:what is national animal of india");
		System.out.println("a:lion");
		System.out.println("b:tiger");
		System.out.println("c:cat");
		String Answer2 = input.nextLine().toLowerCase();
		if(Answer2.equals("b")) {
			System.out.println("Answer is correct");
			score++;
		}else {
			System.out.println("Answer is incorrect");
		}
		
		System.out.println("Q3:what is favourite food in chittoor");
		System.out.println("a:idly");
		System.out.println("b:dosa");
		System.out.println("c:biriyani");
		String Answer3 = input.nextLine().toLowerCase();
		if(Answer3.equals("c")) {
			System.out.println("Answer is correct");
			score++;
		}else {
			System.out.println("Answer is incorrect");
		}
		  
		System.out.println("total score is:" + " " +score);
		
		}

}
