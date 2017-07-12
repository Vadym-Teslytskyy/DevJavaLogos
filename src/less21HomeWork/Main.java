package less21HomeWork;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws ReflectiveOperationException {
		Class<?> myClass = Class.forName("less21HomeWork.MyClass");
		
		Object myObject = new MyClass("Iphone 7S", 20, "Phones");
		
		Method getAmount = myClass.getMethod("getAmount");
		Method getName = myClass.getMethod("getName");
		Method getCategory = myClass.getMethod("getCategory");
		
		Object amount = getAmount.invoke(myObject);
		Object name = getName.invoke(myObject);
		Object category = getCategory.invoke(myObject);
		System.out.println(name+" "+amount+" "+category);
		
		Method setAmount = myClass.getMethod("setAmount", int.class);
		Method setName = myClass.getMethod("setName",String.class);
		Method setCategory = myClass.getMethod("setCategory", String.class);
		
		Object myObject2 = myClass.newInstance();
		setAmount.invoke(myObject2, amount);
		setName.invoke(myObject2, "Nokia");
		setCategory.invoke(myObject2, category);
		System.out.println(myObject2);
		
	}

}
