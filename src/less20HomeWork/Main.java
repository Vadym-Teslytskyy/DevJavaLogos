package less20HomeWork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new MyThread();
		Thread thread2 = new Thread(new RunnableThread());
		thread.join();
		System.out.println();
		thread2.start();
		thread2.join();
		ExecutorService service = Executors.newFixedThreadPool(2);
		System.out.println();
		service.execute(new Task());
		service.execute(new Task());
	}

}
