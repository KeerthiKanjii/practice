package day3;

public class Polymorpishm {
String Name ;
int age ;


	public Polymorpishm(String name, int age) {
	Name = name;
	this.age = age;
}
	


	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public static void main(String[] args) {
		
		Polymorpishm p1 = new Polymorpishm("keerthi",20);
		 System.out.println("Name: " + p1.getName());
	        System.out.println("Age: " + p1.getAge());
	}


	

}
