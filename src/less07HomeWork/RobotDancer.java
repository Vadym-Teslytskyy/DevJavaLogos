package less07HomeWork;

public class RobotDancer extends Robot {

	public RobotDancer(String name) {
		super(name);
	}

	@Override
	void work() {
		System.out.println("я RobotDancer " + name + " Ц € просто танцюю!");
	}
}
