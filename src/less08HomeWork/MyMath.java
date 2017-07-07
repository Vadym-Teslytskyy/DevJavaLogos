package less08HomeWork;

import java.util.Scanner;

public class MyMath {

	public static final double PI = 3.14; // оголошення константи
	public static final int SIDERIGHTTRIANGLE = 5;

	public static void perumetr() {
		System.out.println("Vvedit radius kola?");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		double res;
		res = (double) 2 * PI * input;
		System.out.println("Perumetr kola = " + res);

	}

	public static void ploscha() {
		System.out.println("Vvedit radius kola?");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		double res;
		res = (double) PI * Math.pow(input, 2);
		System.out.println("Ploscha kola = " + res);

	}

	public static void isRightTriangle() {
		System.out.println("Гіпотенуза прямокутного трикутника = " + SIDERIGHTTRIANGLE);
		System.out.println("Для перевірки чи ці дані моуть відповідати прямокутному трикутнику. Введіть перший катет?");
		Scanner sc1 = new Scanner(System.in);
		int input1 = sc1.nextInt();
		System.out.println("Для перевірки чи ці дані моуть відповідати прямокутному трикутнику. Введіть другий катет?");
		Scanner sc2 = new Scanner(System.in);
		int input2 = sc2.nextInt();
		if (Math.pow(SIDERIGHTTRIANGLE, 2) == (Math.pow(input1, 2)) + (Math.pow(input2, 2))) {
			System.out.println("Трикутник прямокутний!!!!");
		} else {
			System.out.println("Трикутник не прямокутний!!! Спробуй ще раз!");
			isRightTriangle();
		}
	}
}
