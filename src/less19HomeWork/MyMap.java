package less19HomeWork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MyMap<K,V> {
	
	private Set<K> keySet = new HashSet<>();
	private List<V> valueList = new ArrayList<>();
	Set<MyEntry<K, V>> mySet = new HashSet<>();
	


	public Set<MyEntry<K, V>> getMySet() {
		return mySet;
	}

	public void setMySet(Set<MyEntry<K, V>> mySet) {
		this.mySet = mySet;
	}

	@Override
	public String toString() {
		return "MyMap [mySet=" + mySet + "]";
	}
	
	public void addToMap(K key,V value) {
		mySet.add(new MyEntry<K,V>(key, value));
	}
	
	public void deleteByKey(K key){
				Iterator<MyEntry<K, V>> it = mySet.iterator();
					while(it.hasNext()) {
						MyEntry<K, V> tmp = it.next();
						if(tmp.getKey().equals(key)) {
							it.remove();
							System.out.println("Key was deleted!");
						}
					}
		
	}
	
	public void deleteByValue(V value){
			Iterator<MyEntry<K, V>> iterator = mySet.iterator();
				while(iterator.hasNext()) {
					MyEntry<K, V> tmp = iterator.next();
					if(tmp.getValue().equals(value)) {
						tmp.setValue(null);
						System.out.println("Value was changed to NULL!");
					}
				}
	}
	
	public void printKeySet() {
		for (MyEntry<K, V> entry : mySet) {
			keySet.add(entry.getKey());
		}
		System.out.println(keySet);
	}
	
	public void printValueList() {
		for (MyEntry<K, V> entry : mySet) {
			valueList.add(entry.getValue());
		}
		System.out.println(valueList);
	}
	
	
	public void printMap() {
		for (MyEntry<K, V> entry :mySet) {
			System.out.println(entry);
		}
	}
	
	
}
