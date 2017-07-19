package less15HomeWork;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import less11.Gender;
import less11.Person;

public class ZooClub implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8663951557765320036L;
	Map<Person, List<Pet>> mapPets = new HashMap<>();

	public ZooClub(Map<Person, List<Pet>> mapPets) {
		this.mapPets = mapPets;
	}
	
	

	public Map<Person, List<Pet>> getMapPets() {
		return mapPets;
	}



	public void setMapPets(Map<Person, List<Pet>> mapPets) {
		this.mapPets = mapPets;
	}

	
	public void zooClubMenu() {
		Scanner scanner = new Scanner(System.in);
		boolean isRun = true;
		while (isRun) {
			System.out.println("Enter '1' to open add menu or '2' to open delete menu or '3' to show all or 'q' to exit");
			String inputMenuType1 = scanner.next();
			switch (inputMenuType1) {
			case "1": {
				addMenu();
			}
				break;
			case "2": {
				deleteMenu();
			}
				break;
			case "3": {
				for (Person person : mapPets.keySet()) {
					for (Pet pet : mapPets.get(person)) {
						System.out.println("Member: "+person+" member`s pets: "+pet);
					}
					if(mapPets.get(person).isEmpty()) System.out.println("Member: "+person);
		}
			}
				break;
			case "q": {
				isRun = false;
			}
				break;

			default:
				System.out.println("Error input! Try again!");
				break;
			}
		}
	}

	private void addMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 to add member or 2 to add pet");
		String addMenuType = scanner.next();
		switch (addMenuType) {
		case "1": {
			addPersonKeyToMap();
		}
			break;
		case "2": {
			addPetValueToMap();
		}
			break;
		default:
			break;
		}
	}

	private void addPersonKeyToMap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name:");
		String inputName = scanner.next();
		System.out.println("Enter age:");
		int inputAge = scanner.nextInt();
		System.out.println("Enter gender:");
		Gender inputGender = Gender.valueOf(scanner.next().toUpperCase());
		Person person = new Person(inputName, inputAge, inputGender);
		if (!mapPets.containsKey(person)) {
			mapPets.put(person, new ArrayList<>());
		}
	}

	private void addPetValueToMap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name:");
		String inputName = scanner.next();
		System.out.println("Enter age:");
		int inputAge = scanner.nextInt();
		System.out.println("Enter gender:");
		Gender inputGender = Gender.valueOf(scanner.next().toUpperCase());
		Person person = new Person(inputName, inputAge, inputGender);
		if (!mapPets.containsKey(person)) {
			mapPets.put(person, new ArrayList<>());
		}

		System.out.println("Enter pet species:");
		String inputPetSpecies = scanner.next();
		System.out.println("Enter pet name:");
		String inputPetName = scanner.next();
		System.out.println("Enter pet age:");
		int inputPetAge = scanner.nextInt();
		mapPets.get(person).add(new Pet(inputPetSpecies, inputPetName, inputPetAge));
	}

	private void deleteMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 to delete member or 2 to delete pet of member or 3 to delete pet from all members");
		String deleteMenuType = scanner.next();
		switch (deleteMenuType) {
		case "1": {
			deleteMemberFromMap();
		}
			break;
		case "2": {
			deletePetFromMember();
		}
			break;
		case "3": {
			deletePetFromMap();
		}
			break;

		default:
			break;
		}
	}
	
	private void deleteMemberFromMap(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name:");
		String inputName = scanner.next();
		System.out.println("Enter age:");
		int inputAge = scanner.nextInt();
		System.out.println("Enter gender:");
		Gender inputGender = Gender.valueOf(scanner.next().toUpperCase());
		Person person = new Person(inputName, inputAge, inputGender);
		Iterator<Person> it = mapPets.keySet().iterator();
		while(it.hasNext()) {
			Person entry = it.next();
			if(entry.equals(person)) {
				it.remove();
				System.out.println("Member was deleted!");
			}
		}
	}
	
	private void deletePetFromMember(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter pet data:");
		System.out.println("Enter pet species:");
		String inputPetSpecies = scanner.next();
		System.out.println("Enter pet name:");
		String inputPetName = scanner.next();
		System.out.println("Enter pet age:");
		int inputPetAge = scanner.nextInt();
		
		Pet pet = new Pet(inputPetSpecies, inputPetName, inputPetAge);
		System.out.println("Enter member data:");
		System.out.println("Enter name:");
		String inputName = scanner.next();
		System.out.println("Enter age:");
		int inputAge = scanner.nextInt();
		System.out.println("Enter gender:");
		Gender inputGender = Gender.valueOf(scanner.next().toUpperCase());
		Person person = new Person(inputName, inputAge, inputGender);
		
		
		if (mapPets.containsKey(person)) {
			for (Entry<Person, List<Pet>> entry : mapPets.entrySet()) {
				Iterator<Pet> it = mapPets.get(person).iterator();
					while(it.hasNext()) {
						Pet tmp = it.next();
						if(tmp.equals(pet)) {
							it.remove();
							System.out.println("Pet was deleted!");
						}
					}
			}
		}
		
		
	}
	
	private void deletePetFromMap(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter pet data:");
		System.out.println("Enter pet species:");
		String inputPetSpecies = scanner.next();
		System.out.println("Enter pet name:");
		String inputPetName = scanner.next();
		System.out.println("Enter pet age:");
		int inputPetAge = scanner.nextInt();
		
		Pet pet = new Pet(inputPetSpecies, inputPetName, inputPetAge);
				
			for (Entry<Person, List<Pet>> entry : mapPets.entrySet()) {
				Iterator<Pet> iterator = entry.getValue().iterator();
						Pet tmp = iterator.next();
						if(tmp.equals(pet)) {
							iterator.remove();
							System.out.println("Pet was deleted from map!");
						}
			}
	}
}
