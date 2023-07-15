package task;

import java.util.Scanner;

public class HobbyHouse {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter your hobby:");
	        String hobby = input.nextLine();
	        
	        System.out.println("Enter your favorite sport:");
	        String sport = input.nextLine();
	        
	        if (sport.equalsIgnoreCase("cricket")) {
	            System.out.println("You are in the sports house in the cricket team.");
	            System.out.println("Choose your options:");
	            int choice = 0;
	            System.out.println("Your choices are: 1. Cricket, 2. Football, 3. Badminton");
	            choice = input.nextInt();
	            
	            switch (choice) {
	                case 1:
	                    System.out.println("It is cricket.");
	                    System.out.println("Enter your favorite cricket player.");
	                    String cricketPlayer = input.nextLine();
	                    break;
	                case 2:
	                    System.out.println("It is football.");
	                    break;
	                case 3:
	                    System.out.println("It is badminton.");
	                    break;
	                default:
	                    System.out.println("Invalid choice.");
	                    break;
	            }
	        } else {
	            System.out.println("You are not interested in cricket.");
	        }
	    }
	}

