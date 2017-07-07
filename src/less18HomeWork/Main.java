package less18HomeWork;

import less18HomeWork.Collection.InnerClass1;
import less18HomeWork.Collection.InnerClass2;
import less18HomeWork.Collection.StaticClass;

public class Main {

	public static void main(String[] args) {
		Object[] objects = {0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		Collection collection = new Collection(objects);
		InnerClass1 iClass1 = collection.new InnerClass1();
		InnerClass2 iClass2 = collection.new InnerClass2();
		StaticClass sClass = new StaticClass(objects);
		System.out.println("task 1:");
		iClass1.next();
		System.out.println();
		System.out.println("task 2:");
		iClass2.next();
		System.out.println();
		System.out.println("task 3:");
		sClass.next();
		System.out.println();
		System.out.println("task 4:");
		collection.anonymCheckArray(objects).next();
		System.out.println();
		System.out.println("task 5:");
		collection.localCheck(objects);
		
	}

}
