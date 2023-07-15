package day4;
enum TrafficColours {
	RED,GREEN,YELLOW;
	

}
	
public class TrafficRules {
static int x= 10;
static int y=10 ;
static int z = 0;

	public static void main(String[] args) {

		if(x >y) {
			System.out.println("Traffic is heavy : " + "RED");
			
		}
		else if(x==y) {
			System.out.println("No Traffic :" + "GREEN");
		}
		else {
			System.out.println("Traffic is medium :" + "YELLOW");
			
		}
		
	}

}
