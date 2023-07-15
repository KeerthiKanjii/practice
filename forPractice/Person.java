package forPractice;

public class Person {
	private String name;

    // constructor
    public Person(String name) {
        this.name = name;
    }

    // instance method
    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

    // main method
    public static void main(String[] args) {
       Person  person1 = new Person("keerthi");
        Person person2 = new Person("kanji");

        person1.sayHello(); 
        person2.sayHello(); 
    }
}