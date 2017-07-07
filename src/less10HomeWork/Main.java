package less10HomeWork;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>();
		Set<Car> carsSet = new LinkedHashSet<>();
		Scanner scanner = new Scanner(System.in);
		boolean isRun = true;

		WheelCommon wheel = new WheelCommon(19,WheelType.SUMMER);
		BodyCommon body = new BodyCommon(BodyColor.RED,BodyType.TRUCK);
		HandlebarCommon handlebar = new HandlebarCommon("rubber", true,20);
		Car car = new Car(wheel, body, handlebar);
		System.out.println(car.toString());
		car.changeCarToCommon();
		System.out.println(car.toString());
		System.out.println();

		WheelCommon wheel1 = new WheelCommon(15,WheelType.SUMMER);
		BodyCommon body1 = new BodyCommon(BodyColor.BLUE,BodyType.HATCHBACK);
		HandlebarCommon handlebar1 = new HandlebarCommon("leather", false,20);
		Car car1 = new Car(wheel1, body1, handlebar1);

		WheelCommon wheel2 = new WheelCommon(17,WheelType.WINTER);
		BodyCommon body2 = new BodyCommon(BodyColor.BROWN,BodyType.CROSSOVER);
		HandlebarCommon handlebar2 = new HandlebarCommon("rubber", true,22);
		Car car2 = new Car(wheel2, body2, handlebar2);

		WheelCommon wheel3 = new WheelCommon(17,WheelType.WINTER);
		BodyCommon body3 = new BodyCommon(BodyColor.BLACK,BodyType.WAGON);
		HandlebarCommon handlebar3 = new HandlebarCommon("rubber", false,25);
		Car car3 = new Car(wheel3, body3, handlebar3);

		WheelCommon wheel4 = new WheelCommon(19,WheelType.SUMMER);
		BodyCommon body4 = new BodyCommon(BodyColor.RED,BodyType.SEDAN);
		HandlebarCommon handlebar4 = new HandlebarCommon("leather", true,30);
		Car car4 = new Car(wheel4, body4, handlebar4);

		cars.add(car);
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		
		carsSet.add(car);
		carsSet.add(car1);
		carsSet.add(car2);
		carsSet.add(car3);
		carsSet.add(car4);
		
		while (isRun) {
			System.out.println("Type 1 to enter in FindCarList Menu or 2 to enter in FindCarsByLinkedHashSet Menu! or 'q' to exit");
			String inpunTypeMenu = scanner.next();
			switch (inpunTypeMenu) {
			case "1":{
				FindCarList findCarList = new FindCarList(cars);
				findCarList.findCarList();
			}
				break;
			case "2":{
				FindCarsByLinkedHashSet findCarsByLinkedHashSet = new FindCarsByLinkedHashSet(carsSet);
				findCarsByLinkedHashSet.findCarSet();
			}
				break;
				
			case "q": {
				isRun = false;
			}break;
			
			default:
				System.out.println("Error input! Try again!");
				break;
			}
		}
		

	}

}
