package less05;

public class Main {

	public static void main(String[] args) {
		String s1 ="Hello";
		String s2 ="Hello";
		String s3 = new String("Hello");
		System.out.println(s1==s2); //true ссилається на 1 місце в пам'яті
		System.out.println(s1==s3.intern()); //false ссилається на різні місця в пам'яті; .intern() буде true бо стирається нове місце і посилається на подібні
		String s4=s1;
		s1+="!";
		System.out.println(s4);// виведе Hello Що не робим з стрічкою створюється нова стрічка поводиться як примітив;
		System.out.println(s2.equals(s3));// порівнює по контенту
		System.out.println(s2.charAt(1));// повертає знач за індексом
		System.out.println(s2.indexOf("l")); // першевходження в стрічку
		System.out.println(s2.contains("lo"));// перевіряє чи є така стрічка в стрічці
		System.out.println(s2.compareTo("Aello"));//для сортування
		System.out.println(s2.length());
		
		
		
	}

}
