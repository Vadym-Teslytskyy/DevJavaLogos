package less20HomeWork;

import java.util.Scanner;

public class MyThread extends Thread{
	
	

	public MyThread() {
		start();
	}

	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter count of Fibonachi numers:");
		int n = scanner.nextInt();
		System.out.println("Потік Thread:");
		for (int i = 0; i <= n; i++) {
            System.out.print(fNumber(i) + " ");
            try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
		
	}
	
	private int fNumber(int index){
		
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
