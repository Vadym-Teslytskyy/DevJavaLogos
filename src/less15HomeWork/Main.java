package less15HomeWork;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import less11.Person;

public class Main {

	public static void main(String[] args) {
		Map<Person, List<Pet>> mapPets = new HashMap<>();

		ZooClub zooClub = new ZooClub(mapPets);
		ZooClubSerialization zSerialization = new ZooClubSerialization(zooClub);
		
		zooClub.zooClubMenu();
		zSerialization.fileMenu();
		
		
	}
}
