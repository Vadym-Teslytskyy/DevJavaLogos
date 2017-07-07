package less11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwitchMenu {

	void startProgram(){
		List<Person> persons = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		boolean isRun = true;
		while (isRun) {
			System.out.println();
			System.out.println("Enter command '1' - add Person or '2' - show list of persons or '3' to enter found menu or '4' to delete someone from list or'q' to exit");
			String enterMenu = scanner.next();
			switch (enterMenu) {
			case "1": {
				System.out.println("Enter name:");
				String name = scanner.next();
				System.out.println("Enter age:");
				int age = scanner.nextInt();
				System.out.println("Enter gender:");
				Gender gender = Gender.valueOf(scanner.next().toUpperCase());
				Person person = new Person(name, age, gender);
				persons.add(person);
			}
				break;
			case "2": {
				System.out.println(persons);
			}
				break;
			case "3": {
				System.out.println(
						"Enter 1 to sort for gender or 2 to sort for age or 3 to sort for name age and gender");
				String inputSort = scanner.next();
				switch (inputSort) {
				case "1": {
					System.out.println("Enter gender what you want to see:");
					Gender inputGenderSort = Gender.valueOf(scanner.next().toUpperCase());
					for (Person person : persons) {
						if (person.getGender() == inputGenderSort) {
							System.out.println(person);
						}
					}
				}
					break;
				case "2": {
					System.out.println("Enter age what you want to see from:");
					int inputAgeSort1 = scanner.nextInt();
					System.out.println("Enter age what you want to see to:");
					int inputAgeSort2 = scanner.nextInt();
					for (Person person : persons) {
						if ((person.getAge() >= inputAgeSort1) && (person.getAge() <= inputAgeSort2)) {
							System.out.println(person);
						}
					}
				}
					break;
				case "3": {
					System.out.println("Enter gender what you want to see:");
					Gender inputGenderSort = Gender.valueOf(scanner.next().toUpperCase());
					System.out.println("Enter age what you want to see from:");
					int inputAgeSort1 = scanner.nextInt();
					System.out.println("Enter age what you want to see to:");
					int inputAgeSort2 = scanner.nextInt();
					System.out.println("Enter name or string what you wanna to found");
					String inputNameSort = scanner.next();
					for (Person person : persons) {
						if ((person.getGender() == inputGenderSort)
								&& ((person.getAge() >= inputAgeSort1) && (person.getAge() <= inputAgeSort2))
								&& (person.getName().contains(inputNameSort))) {
							System.out.println(person);
						}
					}
				}
					break;
				default:
					System.out.println("Error input! Try again!");
					
				}

			}break;
			
			case "4": {
				SwitchMenuIterator switchMenuIterator = new SwitchMenuIterator();
				switchMenuIterator.startDeleteMenu(persons);
			}
				break;
			case "q":{
				isRun = false;
			}
				break;
			default: {
				System.out.println("Error input! Try again!");
			}
				break;
			}
		}
	}
}
