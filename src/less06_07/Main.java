package less06_07;

public class Main {

	public static void main(String[] args) {

		Human human = new Human();
		human.age = 18;
		human.name = "Ivan";
		human.printData();
		human.run();
		Human human2 = new Human("Mukola",25);
		System.out.println(human2);
		
		Pet pet =new Pet("Mark",2);
		pet.startGame();
		
	
		
	}

}
