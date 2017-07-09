package less20HomeWork;

import java.lang.reflect.Array;
import java.util.Scanner;

public class RunnableThread implements Runnable {

	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter count of Fibonachi numers:");
		int n = scanner.nextInt();
		int [] fArray = new int[n+1];// Якщо забрати +1 то викидує помилку чому???
		for (int i = 0; i <= n; i++) {
            fArray[i] = fNumber(i);
        }
		System.out.println("Потік Runnable:");
		for (int i = fArray.length-1; i >= 0; i--) {
	        System.out.print(fArray[i] + " ");
	        try {
	        	Thread.sleep(1000);
	        } catch (InterruptedException e) {
	        	e.printStackTrace();
	        }
	    }
	}

	private int fNumber(int index) {

		if (index <= 0) {
			return 0;
		} else if (index == 1) {
			return 1;
		} else if (index == 2) {
			return 1;
		} else {
			return fNumber(index - 1) + fNumber(index - 2);
		}

	}
}
