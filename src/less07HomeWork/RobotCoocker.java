package less07HomeWork;

public class RobotCoocker extends Robot {

	public RobotCoocker(String name) {
		super(name);
	}

	@Override
	void work() {
		System.out.println("� RobotCoocker " + name + " � � ������ �����!");
	}
}
