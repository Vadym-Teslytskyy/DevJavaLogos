package less12;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("Petro");
		strings.add("Ivan");
		strings.add("Roma");
		System.out.println(strings);
		System.out.println(strings.set(1, "Artem"));
		System.out.println(strings);
		System.out.println(strings.size());
		System.out.println(strings.get(0));
		System.out.println();
		for (String string : strings) {
			System.out.println(string);
		}
		
		
	}

}
