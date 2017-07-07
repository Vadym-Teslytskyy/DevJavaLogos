package less07HomeWork;

public class Main {

	public static void main(String[] args) {

		Robot robot = new Robot("Gary");
		Robot robot2 = new CoffeRobot("Chappy");
		Robot robot3 = new RobotDancer("Rusty");
		Robot robot4 = new RobotCoocker("Howard");
		robot.work();
		robot2.work();
		robot3.work();
		robot4.work();
	}

}
