package less06_07;

public class Main1 {

	public static void main(String[] args) {

		Hunter hunter = new Hunter();
		hunter.name = "Ivan";
		hunter.killMammont();
		hunter.killMammont();
		hunter.walk();
		Human human = new Hunter("Mukola",18);
		human.run();
		System.out.println(human);
	}

}
