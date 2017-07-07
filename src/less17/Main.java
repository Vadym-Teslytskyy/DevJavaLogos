package less17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

import javax.security.auth.login.CredentialNotFoundException;

import less11.Gender;
import less11.Person;

public class Main {

	public static void main(String[] args) {
		//Person person = new Person("Ivan", 18, Gender.MALE);
//		OutputStream os = null;
//		ObjectOutputStream oos = null;
//		try{
//			os = new FileOutputStream(new File("save.save"));
//			oos = new ObjectOutputStream(os);
//			oos.writeObject(person);
//		}catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (oos!=null) {
//				try {
//					oos.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//			if (os!=null) {
//				try {
//					os.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
		
//		try(ObjectInputStream ois = 
//				new ObjectInputStream(
//						new FileInputStream(
//								new File("save.save")))){
//			
//				Person person = (Person) ois.readObject();
//				System.out.println(person);
//		}catch (IOException | ClassNotFoundException e) {
//				e.printStackTrace();
//			 }
		
		Person person = new Person("Mykola", 19, Gender.MALE);
		try(FileWriter writer = new FileWriter("save.txt", true)){
			writer.append(person.getName()+" "+person.getAge()+" "+person.getGender()+"\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
