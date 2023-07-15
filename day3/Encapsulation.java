package day3;

public class Encapsulation {
private String name = "keerthi" ;
 private int age = 20 ;
 
	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

	public static void main(String[] args) {
		
		Encapsulation p2 = new Encapsulation();
	//	p2.setName("Kavitha");

		//p2.setAge(25);
		
		
		System.out.println(p2.getName());
        System.out.println(p2.getAge());
	}

}
