package less18HomeWork;

import java.util.Arrays;

public class Collection {
	
	 Object[] objectsArray;

	public Collection(Object[] objectsArray) {
		this.objectsArray = objectsArray;
	}

	public Object[] getObjectsArray() {
		return objectsArray;
	}

	public void setObjectsArray(Object[] objectsArray) {
		this.objectsArray = objectsArray;
	}

	@Override
	public String toString() {
		return "Collection [objectsArray=" + Arrays.toString(objectsArray) + "]";
	}
	
	public class InnerClass1 implements less18HomeWork.Iterator{
		
		private int nextIndex = 0;
		
		
		@Override
		public boolean hasNext() {
			 return (nextIndex <= objectsArray.length - 1);
		}

		@Override
		public Object next() {
			while (hasNext()) {
				if ((int) objectsArray[nextIndex] % 2 != 0) {
					System.out.print(0 + " ");
				} else {
					System.out.print(objectsArray[nextIndex] + " ");
				}
				nextIndex++;
			}
			return objectsArray;
		}
		
		
	}
	
	public class InnerClass2 implements less18HomeWork.Iterator{
		
		private int nextIndex = objectsArray.length - 1;
		
		@Override
		public boolean hasNext() {
			return (nextIndex >= 0);
		}

		@Override
		public Object next() {
			while (hasNext()) {
				System.out.print(objectsArray[nextIndex] + " ");
				nextIndex -= 2;
			}
			return objectsArray;
		}
		
	}
	
	public static class StaticClass implements Iterator{
		
		Object[] objectsArrayStatic;
		
		public StaticClass(Object[] objectsArray) {
			this.objectsArrayStatic = objectsArray;
		}

		private int nextIndex = 0;
		

		@Override
		public boolean hasNext() {
			return (nextIndex <= objectsArrayStatic.length - 1);
		}

		@Override
		public Object next() {
			while (hasNext()) {
				if ((int) objectsArrayStatic[nextIndex] % 2 == 0) {
					System.out.print(((int) objectsArrayStatic[nextIndex] + 1) + " ");
				}
				nextIndex += 2;
			}
			return objectsArrayStatic;
		}
	}
	
	Iterator anonymCheckArray(Object[] objects) {
		return new Iterator() {
			private int nextIndex = objects.length - 1;

			@Override
			public boolean hasNext() {
				return (nextIndex >= 0);
			}

			@Override
			public Object next() {
				while (hasNext()) {
					if ((int) objects[nextIndex] % 2 != 0) {
						System.out.print(objects[nextIndex] + " ");
					}
					nextIndex -= 3;
				}
				return objects;
			}
		};
	}
	
	void localCheck(Object[] objects) {
		class LocalClass implements Iterator {
			private int nextIndex = 0;

			@Override
			public boolean hasNext() {
				return (nextIndex <= objects.length-1);
			}

			@Override
			public Object next() {
				while (hasNext()) {
					if ((int) objects[nextIndex] % 2 == 0) {
						System.out.print(((int) objects[nextIndex] - 100) + " ");
					}
					nextIndex += 5;
				}
				return objects;
			}
		}
		LocalClass lClass = new LocalClass();
		lClass.next();
}
	
}
