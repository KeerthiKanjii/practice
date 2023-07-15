package forPractice;

public class Outerclass {
	
	public void Sum() {
		System.out.println("print sum");
	}
 class Innerclass extends Outerclass{
	
	
	public void sub() {
		System.out.println("print sub");
	}
}

public static void main(String[] args) {
	Outerclass obj = new Outerclass();
	Outerclass obj1 = obj.new Innerclass();
	obj1.Sum();
	
	
	
	
	
	//Outerclass obj = new Outerclass();
  //  Outerclass.Innerclass obj1 = obj.new Innerclass(); 
 //   obj1.sub();

	
	
	
}
}
