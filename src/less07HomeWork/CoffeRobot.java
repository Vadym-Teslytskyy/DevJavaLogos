package less07HomeWork;

public class CoffeRobot extends Robot {

	public CoffeRobot(String name) {
		super(name);
	}

	@Override
	void work() {
		System.out.println("я CoffeRobot " + name + " Ц € варю каву!");
	}
}
