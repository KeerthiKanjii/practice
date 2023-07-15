package day5;



public class SimpleThread extends Thread {
	int a = 10;
	int b=20;
    public void run() {
        System.out.println("multi thread is running");
        
       int c = a+b; {
        	
    	   System.out.println("Addition of two numbers: " +c);
        }

       int d = a-b;{
    	   System.out.println("Subtraction of two numbers: " +d);
       }
       
       System.out.println("multi thread is completed");
        	
        }
    
   
}
