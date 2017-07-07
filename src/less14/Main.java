package less14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import less11.Gender;
import less11.Person;

public class Main {

	public static void main(String[] args) {
		Set<Person> persons = new TreeSet<>(); // А TreeSet повертає відсортовану (в даному випадку по name бо compareTo перепис під name) множину LinkedHashSet Зберігає послідовність добавленостей а HashSet<>() - не зберігає
		System.out.println(persons.add(new Person("Ivan", 18, Gender.MALE)));
		System.out.println(persons.add(new Person("Ivan", 18, Gender.MALE)));
		persons.add(new Person("Mykola", 34, Gender.MALE));
		persons.add(new Person("Petro", 28, Gender.MALE));
		System.out.println(persons);
		System.out.println("AaAaAaAa".hashCode());
		System.out.println("AaAaAaBB".hashCode());
		System.out.println("AaAaBBAa".hashCode());
		
		List<Person> personsList = new ArrayList<>(persons);
		for (Person person : personsList) {
			System.out.println(person);
		}
		System.out.println();
		personsList.sort(null);
		for (Person person : personsList) {
			System.out.println(person);
		}
		System.out.println();
		
		System.out.println();
		personsList.sort(new PersonComparatorByNameDesc());
		for (Person person : personsList) {
			System.out.println(person);
		}
		System.out.println();
		
		System.out.println();
		personsList.sort((o1,o2)->o1.getAge()-o2.getAge()); // лямда вираз
		for (Person person : personsList) {
			System.out.println(person);
		}
		System.out.println();
		
		System.out.println();
		personsList.sort((o1,o2)->Integer.compare(o1.getAge(), o2.getAge()));
		for (Person person : personsList) {
			System.out.println(person);
		}
		System.out.println();
	}

}
