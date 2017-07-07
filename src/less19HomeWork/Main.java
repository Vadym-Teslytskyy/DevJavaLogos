package less19HomeWork;

public class Main {

	public static void main(String[] args) {
		
		MyMap<String, Boolean> myMap = new MyMap<>();
		myMap.addToMap("1", false);
		myMap.addToMap("2", true);
		myMap.addToMap("3", true);
		myMap.addToMap("4", false);
		myMap.addToMap("5", true);
		myMap.printKeySet();
		System.out.println();
		myMap.printValueList();
		System.out.println();
		myMap.printMap();
		System.out.println();
		myMap.deleteByKey("1");
		myMap.printMap();
		System.out.println();
		myMap.deleteByValue(false);
		myMap.printMap();
		
	}

}
