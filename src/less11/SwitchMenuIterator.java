package less11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SwitchMenuIterator {
	
	void startDeleteMenu( List<Person> persons){
		Scanner scanner = new Scanner(System.in);
		boolean isRun = true;
		while (isRun) {
			System.out.println();
			System.out.println("Enter command '1' - to delete for a gender or '2' - to delete for an age diapason or 'q' to exit from delete menu");
			String enterMenu = scanner.next();
			switch (enterMenu) {
			case "1": {
				System.out.println("Enter gender what you wanna to delete:");
				Gender gender = Gender.valueOf(scanner.next().toUpperCase());
				Iterator<Person> iterPerson = persons.iterator();
				while(iterPerson.hasNext()){
					Person temp = iterPerson.next();
					if (temp.getGender()==gender) {
						iterPerson.remove();
					}
				}
				System.out.println("Gender - "+gender+" has deleted from list" );
			}
				break;
			case "2": {
				System.out.println("Enter age what you want to delete from:");
				int inputAgeSort1 = scanner.nextInt();
				System.out.println("Enter age what you want to delete to:");
				int inputAgeSort2 = scanner.nextInt();
				Iterator<Person> iterPerson = persons.iterator();
				while(iterPerson.hasNext()){
					Person temp = iterPerson.next();
					if ((temp.getAge()>=inputAgeSort1)&&(temp.getAge()<=inputAgeSort2)) {
						iterPerson.remove();
					}
				}
				System.out.println("People who have age from "+inputAgeSort1+" to "+inputAgeSort2+" have deleted form list");
			}
				break;
			case "q": {
				isRun = false;
			}break;
			default: {
				System.out.println("Input Error! Try again!");
			}
				break;
			}
		}
	}
}
