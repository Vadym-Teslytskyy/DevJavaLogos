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
			System.out.println("� "+name + " ��� " + age + " ���� " + "���-��� � ����� "  + " ��� ������ = "+ sutist);
		} else {
			System.out.println("������� ����!!!!");
		}
		startGame();

	}

	void eat() {
		if (sutist < 10) {
			sutist++;
			System.out.println("� "+name + " ��� " + age + " ���� " + "���-���! " + " ��� ������ = "+ sutist);
		} else {
			System.out.println("� ����� ����� ������!!!");

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
