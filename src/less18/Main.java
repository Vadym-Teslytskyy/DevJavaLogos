package less18;

import java.util.Comparator;

import less18.Person.Pet;

public class Main {

	public static void main(String[] args) {
		Person person = new Person("Ivan",18);
		Pet pet = person.new Pet("Barsik");
		Person person2 = new Person("Mykola",26);
		Pet pet2 = person2.new Pet("Barsik");
		
		Person person3 = new Person.Builder()
				.name("Petro")
				.age(19)
				.pet("Barsik")
				.pet("Tuzik")
				.pet("Komposter")
				.build();
		System.out.println(person3);
		person3.getPets().sort(getComparator(1));
		System.out.println(person3);
	}
	
	static Comparator<Pet> getComparator(final int rev){
		return new Comparator<Person.Pet>() {
			public int compare(Pet o1, Pet o2) {
				return rev*o1.getName().compareTo(o2.getName());
			}
		};
	}
	
	
}
