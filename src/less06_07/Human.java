package less06_07;

public class Human {

	int age;

	String name;

	Human() {
		printData();
		System.out.println("Hello");
	}

	Human(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(this);
	}
	
	void eat (String food) {
		System.out.println(name+": mmm taste "+food);
	}

	void run() {
		System.out.println(name + ": go-go-go!!!");
	}

	void printData() {
		System.out.println(name + " " + age);
	}
}
