package less13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("Ivan");
		strings.add("Petro");
		strings.add("Mykola");
		strings.add("Artem");
		System.out.println(strings);
//		for (String string : strings) {
//			strings.remove(string);
//		}
//		for (int i = 0; i < strings.size(); i++) {
//			if (strings.get(i).contains("o")) {
//				strings.remove(i);
//				i--;
//			}
//			
//		}
		Iterator<String> iter = strings.iterator();
		while(iter.hasNext()){
			String temp = iter.next();
			if (temp.contains("o")&& temp.length()>=2) {
				iter.remove();
			}
		}
		System.out.println(strings);
		
		ListIterator<String> listIter = strings.listIterator(strings.size());
		while (listIter.hasPrevious()) {
			String tmp = listIter.previous();
			System.out.println(tmp+" "+listIter.nextIndex());
			
		}
	}

}
