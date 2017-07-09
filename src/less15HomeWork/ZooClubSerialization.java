package less15HomeWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class ZooClubSerialization implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9107620979856027319L;
	ZooClub zooClub;

	public ZooClubSerialization(ZooClub zooClub) {
		this.zooClub = zooClub;
	}
	
	public void fileMenu(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter action: '1' add ZooClub to file or '2' overwrite file or '3' to print file to console or 's' to serialization or 'd' to deserialization");
		String inputFileMenuType = scanner.next();
		switch (inputFileMenuType) {
		case "s":{
			serialisation();
		}break;
		
		case "d":{
			deserialisation();
		}break;
		
		case "1":{
			addZooClubToFile();
		}break;
		
		case "2":{
			overWriteZooClubFile();
		}break;
		
		case "3":{
			printZooClubFile();
		}break;

		default:
			break;
		}
	}
	
	public void addZooClubToFile() {
			try(FileWriter writer = new FileWriter("ZooClub.txt", true)){
				writer.append(zooClub.getMapPets()+"\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
	
	public void overWriteZooClubFile() {
			try(FileWriter writer = new FileWriter("ZooClub.txt", false)){
				writer.append(zooClub.getMapPets()+"\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public void printZooClubFile() {
		
		try(Scanner sc = new Scanner(new File("ZooClub.txt"))){
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			System.out.println(line);
		}
	}catch (IOException e) {
		e.printStackTrace();
	}
	}
	
	public void serialisation(){
			try(ObjectOutputStream os = 
					new ObjectOutputStream(
							new FileOutputStream(
									new File("ZooClub.save")))){
									os.writeObject(zooClub);
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public void deserialisation(){
				try(ObjectInputStream ois = 
				new ObjectInputStream(
						new FileInputStream(
								new File("ZooClub.save")))){
				   zooClub = (ZooClub) ois.readObject();
				System.out.println(zooClub);
		}catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			 }
	}
	
	
}

	