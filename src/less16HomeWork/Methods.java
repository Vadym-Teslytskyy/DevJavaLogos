package less16HomeWork;

public class Methods {

	public void sumOfNumbers( int a, int b) {
		int res;
		try {
			validation(a, b);
		} catch (IllegalAccessException | MyException e) {
			e.printStackTrace();
		}
		res = a+b;
		System.out.println(res);
	}
	
	public void differenceOfNumbers(int a, int b) {
		int res;
		try {
			validation(a, b);
		} catch (IllegalAccessException | MyException e) {
			e.printStackTrace();
		}
		res = a-b;
		System.out.println(res);
	}
	
	public void multiplicationOfNumbers(int a, int b){
		int res;
		try {
			validation(a, b);
		} catch (IllegalAccessException | MyException e) {
			e.printStackTrace();
		}
		res = a*b;
		System.out.println(res);
	}
	
	public void divisionOfNumbers(int a, int b){
		int res;
		try {
			validation(a, b);
		} catch (IllegalAccessException | MyException e) {
			e.printStackTrace();
		}
		res = a/b;
		System.out.println(res);
	}
	
	public void validation(int a, int b) throws IllegalAccessException, MyException{
		if (a < 0 || b < 0) throw new IllegalArgumentException();
		if ((a == 0 && b != 0) || (a != 0 && b == 0)) throw new ArithmeticException();
		if (a == 0 || b == 0) throw new IllegalAccessException();
		if (a > 0 && b > 0) throw new MyException("My exception!");
	}
}
