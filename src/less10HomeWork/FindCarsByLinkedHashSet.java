package less10HomeWork;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class FindCarsByLinkedHashSet {

	Set<Car> cars = new LinkedHashSet<>();
	private boolean isRun = true;

	FindCarsByLinkedHashSet(Set<Car> cars) {
		this.cars = cars;
	}

	public void findCarSet() {
		Scanner scanner = new Scanner(System.in);
		while (isRun) {
			System.out.println();
			System.out.println(
					"Select the action: '0' to show Set '1' to 'Машинам, які мають вказаний колір кузова та вказаний діаметр колеса, змінити тип шин на вказаний' or '2' to 'Видалити машини, діаметр колес яких попадає у вказаний діапазон.' or '3' to 'Знайти машини, які мають вказаний тип шин та діаметр коліс яких попадає у вказаний діапазон.' or 'q' to exit");
			String enterMenu = scanner.next();
			switch (enterMenu) {
			
			case "0": {
				System.out.println(cars);
			} break;
			
			case "1": {
				taskOne();
			} break;
			
			case "2":{
				taskTwo();
			}break;
			
			case "3":{
				taskThree();
			}break;
			
			case "q": {
				isRun = false;
			}break;
			
			default:{
				System.out.println("Error input! Try again!");
			}break;
			
		  }
		}
	}
	
	private void taskOne(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter color of car");
		BodyColor inputColor = BodyColor.valueOf(scanner.next().toUpperCase());
		System.out.println("Enter diameter of wheels of car");
		int inputDiameterOfWheels = scanner.nextInt();
		System.out.println("Enter the type of wheels you want to change:");
		WheelType inputWheelsType =WheelType.valueOf(scanner.next().toUpperCase());
		
		for (Car car : cars) {
			if ((car.getBody().getBodyColor()==inputColor)
					&&(car.getWheel().getDiameterOfWheel()==inputDiameterOfWheels)) {
				car.getWheel().setWheelType(inputWheelsType);
			}
		}
		System.out.println("Type of wheels has changed!");
	}
	private void taskTwo(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter diameter of wheels what you want to delete, from:");
		int inputWheelsDiameter1 = scanner.nextInt();
		System.out.println("Enter diameter of wheels what you want to delete, to:");
		int inputWheelsDiameter2 = scanner.nextInt();
		Iterator<Car> iterCar2 = cars.iterator();
		while(iterCar2.hasNext()){
			Car temp = iterCar2.next();
			if ((temp.getWheel().getDiameterOfWheel() >= inputWheelsDiameter1)&&(temp.getWheel().getDiameterOfWheel() <= inputWheelsDiameter2)) {
				iterCar2.remove();
				System.out.println("Car has deleted");
			}
		}
		System.out.println("Cars who have  wheels diameter from "+inputWheelsDiameter1+" to "+inputWheelsDiameter2+" have deleted form set");
	}
	
	private void taskThree(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter body type what you want to delete");
		WheelType inputWheelType = WheelType.valueOf(scanner.next().toUpperCase());
		System.out.println("Enter diameter of handlebar what you want to delete, from:");
		int inputWheelsDiameter1 = scanner.nextInt();
		System.out.println("Enter diameter of handlebar what you want to delete, to:");
		int inputWheelsDiameter2 = scanner.nextInt();
		
		for (Car car : cars) {
			if ((car.getWheel().getWheelType()==inputWheelType)
					&&(car.getWheel().getDiameterOfWheel() >= inputWheelsDiameter1)
					&&(car.getWheel().getDiameterOfWheel() <= inputWheelsDiameter2)) {
				System.out.println(car);
			}
		}
	}

}
