package less16;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			System.out.println(2/0);
		} catch (ArithmeticException | NullPointerException e) {
			e.printStackTrace(System.out);
		} catch (RuntimeException e) {
			e.printStackTrace(System.out);
		}catch (Exception e) {
			e.printStackTrace(System.out);
		}catch (Throwable e) {
			e.printStackTrace(System.out);
		} finally { //для закриття ресурсів
			
		}
		System.out.println("by-by");
		asas();
	}
	
	static int asas(){
		throw new IllegalArgumentException("Так сі стало)!");
	}
	

}
