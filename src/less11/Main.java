package less11;

public class Main {

	public static void main(String[] args) {
		// Gender gender = new Gender(); ���� ��� ������ �� ����� �� �����������
		// private
		Person person = new Person("Ivan", 18, Gender.MALE);
		System.out.println(person);
		String input = "male";
		Gender gender = Gender.valueOf(input.toUpperCase());// ������� � �����
															// gender input �
															// ����� ������
															// Gender(�������
															// ����� � ��� ���
															// �� �������)
		System.out.println(gender);
		Gender[] genders = Gender.values(); // ���������� ������
		System.out.println(genders.length);
		System.out.println(gender.ordinal()); // ������� ������� � �����
												// ���������� ������� (�� �����
												// �� ����������� ����
												// ������!!!)
		System.out.println(gender.name()); // ������� ��'� ����������
	}

}
