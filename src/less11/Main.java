package less11;

public class Main {

	public static void main(String[] args) {
		// Gender gender = new Gender(); “аке вже зобити не можна бо конструктор
		// private
		Person person = new Person("Ivan", 18, Gender.MALE);
		System.out.println(person);
		String input = "male";
		Gender gender = Gender.valueOf(input.toUpperCase());// повертаЇ в зм≥нну
															// gender input з
															// типом данних
															// Gender(парсить
															// стр≥нг в той тип
															// що потр≥бно)
		System.out.println(gender);
		Gender[] genders = Gender.values(); // вит€гненн€ масиву
		System.out.println(genders.length);
		System.out.println(gender.ordinal()); // повертаЇ позиц≥ю в масив≥
												// допустимих значень (не залеж
												// в≥д оголошеного вище
												// масиву!!!)
		System.out.println(gender.name()); // повертаЇ ≥м'€ екземпл€ру
	}

}
