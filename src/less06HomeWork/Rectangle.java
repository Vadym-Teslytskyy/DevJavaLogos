package less06HomeWork;

import java.util.Scanner;

public class Rectangle {

	int height;
	int width;

	Rectangle() {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Enter height:");
		height = scanner.nextInt();
		System.out.println("Enter width:");
		width = scanner.nextInt();
	}

	Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	void area() {
		if (height != width) {
			int res;
			res = height * width;
			System.out.println("Площа прямокутника з висотою " + height + " та шириною " + width + " =" + res);
		} else
			System.out.println("Ці параметри не підходять для прямокутника!(сторони мають бути різної довжини)");

	}

	void perimeter() {

		int res;
		res = (height + width) * 2;
		System.out.println("Периметр прямокутника з висотою " + height + " та шириною " + width + " =" + res);

	}
}
