package less05HomeWork;


public class Main01 {

	public static void main(String[] args) {

		String[][] questions = new String[5][2];
		questions[0][0] = "������� �������� '���� �����'?";
		questions[0][1]="��������";
		questions[1][0] = "������� ������� �� ������?";
		questions[1][1]="������";
		questions[2][0] = "������� ���������� ���?";
		questions[2][1]="�����";
		questions[3][0] = "������� ������?";
		questions[3][1]="���";
		questions[4][0] = "������� �������?";
		questions[4][1]="�����";
		int rand = random(0, 4);
		for(int i = 0; i<questions[rand][1].length();i++){
			
		}
		
	}

	static int random(int min, int max) {
		return (int) Math.round(Math.random() * (max - min) + min);
	}
	
	
}
