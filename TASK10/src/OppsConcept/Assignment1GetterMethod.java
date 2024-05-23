package OppsConcept;

class Person

{

	private String name;// private data member
	private int age;

	// Parameterized Constructor
	public Person(String name1, int age1) {
		name = name1;
		age = age1;
	}

	// Getter methods-----------------------------------//return string
	public String getName() {
		return name;
	}

	// ------------------------------------------------------returns integer
	public int getAge() {
		return age;
	}
}

public class Assignment1GetterMethod {

	public static void main(String[] args) {
		Person person = new Person("John", 30);
		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());

	}

}
