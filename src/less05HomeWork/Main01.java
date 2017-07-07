package less05HomeWork;


public class Main01 {

	public static void main(String[] args) {

		String[][] questions = new String[5][2];
		questions[0][0] = "Прізвище ведучого 'Поле чудес'?";
		questions[0][1]="Якубович";
		questions[1][0] = "Прізвище тренера ФК Динамо?";
		questions[1][1]="Ребров";
		questions[2][0] = "Прізвище презедента США?";
		questions[2][1]="Трамп";
		questions[3][0] = "Столиця України?";
		questions[3][1]="Київ";
		questions[4][0] = "Столиця Франції?";
		questions[4][1]="Париж";
		int rand = random(0, 4);
		for(int i = 0; i<questions[rand][1].length();i++){
			
		}
		
	}

	static int random(int min, int max) {
		return (int) Math.round(Math.random() * (max - min) + min);
	}
	
	
}
