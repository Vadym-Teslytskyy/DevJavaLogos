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
			System.out.println("����� ������������ � ������� " + height + " �� ������� " + width + " =" + res);
		} else
			System.out.println("ֳ ��������� �� �������� ��� ������������!(������� ����� ���� ���� �������)");

	}

	void perimeter() {

		int res;
		res = (height + width) * 2;
		System.out.println("�������� ������������ � ������� " + height + " �� ������� " + width + " =" + res);

	}
}
