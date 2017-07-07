package less06_07;

import java.util.Scanner;

public class Pet {

	int age;
	String name;
	int sutist = 5;

	Pet(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(this);
	}

	void run() {
		if (sutist != 0) {
			sutist--;
			System.out.println("Я "+name + " мені " + age + " роки " + "Гав-Гав я пробіг "  + " моя ситість = "+ sutist);
		} else {
			System.out.println("Погодуй мене!!!!");
		}
		startGame();

	}

	void eat() {
		if (sutist < 10) {
			sutist++;
			System.out.println("Я "+name + " мені " + age + " роки " + "Ням-Ням! " + " моя ситість = "+ sutist);
		} else {
			System.out.println("Я ситий давай побігаєм!!!");

		}
		startGame();
	}

	void startGame() {
		System.out.println("Enter 1 - If you wanna that pets will run or 0 if you wanna feed pets. ");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if (input == 1)
			run();
		if (input == 0)
			eat();

	}
}
