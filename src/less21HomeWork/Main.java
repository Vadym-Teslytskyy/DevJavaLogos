package less21HomeWork;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.annotation.Annotation;

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
		
		  System.out.println("Пакет:");
	      Package p = myClass.getPackage();
	      System.out.println(p.getName());
	      
	      System.out.println("Клас:");
	        System.out.println(myClass.getSimpleName());
	        
	        System.out.println("Модифікатори");
	        int modifiers = myClass.getModifiers();
	        System.out.println(getModifiers(modifiers));        

	        System.out.println("Суперклас:");
	        System.out.println(myClass.getSuperclass().getSimpleName());

	        System.out.println("Інтерфейcи:");
	        Class<?>[] interfaces = myClass.getInterfaces();
	        for (Class<?> class1 : interfaces) {
				System.out.println(class1);
			}
	        
	        System.out.println("Поля:");
	        Field[] fields = myClass.getDeclaredFields();       
	        for (Field field : fields) {
	            System.out.println(getModifiers(field.getModifiers())
	                    + getType(field.getType()) + " " + field.getName() + ";");
	        }

	        System.out.println("Конструктори:");
	        Constructor<?>[] constructors = myClass.getDeclaredConstructors();
	        for (Constructor<?> c : constructors) {
	            System.out.print(getModifiers(c.getModifiers()) +
	                    myClass.getSimpleName() + "(");
	            System.out.print(getParameters(c.getParameterTypes()));
	            System.out.println(") { }");
	        }

	        System.out.println("Методи:");
	        Method[] methods = myClass.getDeclaredMethods();
	        for (Method m : methods) {
	           Annotation[] annotations = m.getAnnotations();
	            for (Annotation a : annotations)
	                System.out.print("@" + a.annotationType().getSimpleName() + " ");
	            System.out.print(getModifiers(m.getModifiers()) +
	                    getType(m.getReturnType()) + " " + m.getName() + "(");
	            System.out.print(getParameters(m.getParameterTypes()));
	            System.out.println(")");
	        }
	        System.out.println("}");
	    }

	    static String getModifiers(int m) {
	        String modifiers = "";
	        if (Modifier.isPublic(m)) modifiers += "public ";
	        if (Modifier.isProtected(m)) modifiers += "protected ";
	        if (Modifier.isPrivate(m)) modifiers += "private ";
	        if (Modifier.isStatic(m)) modifiers += "static ";
	        if (Modifier.isAbstract(m)) modifiers += "abstract ";
	        return modifiers;
	    }

	    static String getType(Class<?> cl) {
	        String type = cl.isArray()
	                ? cl.getComponentType().getSimpleName()
	                : cl.getSimpleName();
	        if (cl.isArray()) type += "[]";
	        return type;
	    }

	    static String getParameters(Class<?>[] params) {
	        String p = "";
	        for (int i = 0, size = params.length; i < size; i++) {
	            if (i > 0) p += ", ";
	            p += getType(params[i]) + " arg";
	        }
	        return p;
	}
		
	

}
