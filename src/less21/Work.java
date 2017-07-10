package less21;

public class Work implements IWork{

	@Override
	@Wrapper
	public void doWork1() {
		System.out.println("work 1");
	}

	@Override
	public void doWork2() {
		System.out.println("work 2");
	}

}
