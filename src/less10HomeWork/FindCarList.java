package less10HomeWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import less11.Gender;
import less11.Person;

public class FindCarList {

	List<Car> cars = new ArrayList<>();
	private boolean isRun = true;

	public FindCarList(List<Car> cars) {
		this.cars = cars;
	}

	public void findCarList() {
		Scanner scanner = new Scanner(System.in);
		while (isRun) {
			System.out.println();
			System.out.println(
					"If u wanna find some cars  enter '1' or '2' - show list of cars or '3' to change cars or 'q' to exit");
			String enterMenu = scanner.next();
			switch (enterMenu) {
			case "1": {
				System.out.println(
						"Find cars with same diameter of wheels enter '1' or '2' to find cars with same diameters of whells and same color");
				String inputFindCar = scanner.next();
				switch (inputFindCar) {
				case "1": {
					taskOne();
				}
					break;

				case "2": {
					taskTwo();
				}
					break;
				default:
					System.out.println("Error input! Try again!");
					break;
				}
			}
				break;
			case "2": {
				for (Car car5 : cars) {
					System.out.println(car5);
				}
			}
				break;
			case "3": {
				System.out.println(
						"Enter 1 to 'Замінити в усіх машинах, які мають червоний колір кузова, кермо на інше' or 2 to 'Збільшити діаметр коліс вдвічі, якщо кермо має кнопочки.'  or 3 to 'Замінити усі машини, які мають колеса діаметром менші за введене значення, на інші машини.' or '4' - to enter in taskMenu2 ");
				String inputChange = scanner.next();
				switch (inputChange) {
				case "1": {
					taskThree();
				}
					break;
				case "2": {
					taskFour();
				}
					break;
				case "3": {
					taskFive();
				}
					break;
				case "4": {
					findCarList2(cars);
				}
					break;
				default:
					System.out.println("Error input! Try again!");
					break;
				}
			}
				break;
			case "q": {
				isRun = false;
			}
				break;
			default: {
				System.out.println("Error input! Try again!");
			}
				break;
			}
		}
	}

	public void findCarList2(List<Car> cars) {
		Scanner scanner = new Scanner(System.in);
		boolean isRun = true;
		while (isRun) {
			System.out.println();
			System.out.println(
					"Enter command '1' - 'Знайти машини, які використовують введений тип кузова' or '2' - 'Видалити з ліста усі машини, які мають введений колір кузова.' or '3' - 'Замінити усім машинам, діаметр коліс яких лежить у введеному діапазоні шини на зимові.' or '4'- 'Видалити усі машини, які мають введений тип кузова та введений діапазон діаметра керма.' or '5'- 'Запам'ятати індекси машин, які мають введений тип кузова.'  or'q' to exit from  menu");
			String enterMenu = scanner.next();
			switch (enterMenu) {
			case "1": {
				taskSix();
			}
				break;
			case "2": {
				taskSeven();
			}
				break;
			case "3": {
				taskEight();
			}
				break;
			case "4": {
				taskNine();
			}
				break;
			case "5": {
				taskTen();
			}
				break;
			case "q": {
				isRun = false;
			}
				break;
			default: {
				System.out.println("Input Error! Try again!");
			}
				break;
			}
		}
	}

	private void taskOne() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter diameter of wheels what you want to find:");
		int diametrOfWheels = scanner.nextInt();
		for (Car car : cars) {
			if (car.getWheel().getDiameterOfWheel() == diametrOfWheels) {
				System.out.println(car);
			}
		}
	}

	private void taskTwo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter diameter of wheels what you want to find:");
		int diametrOfWheels = scanner.nextInt();
		System.out.println("Enter body color what you want to find:");
		BodyColor inputBodyColor = BodyColor.valueOf(scanner.next().toUpperCase());
		for (Car car : cars) {
			if ((car.getWheel().getDiameterOfWheel() == diametrOfWheels)
					&& (car.getBody().getBodyColor() == inputBodyColor)) {
				System.out.println(car);
			}
		}
	}

	private void taskThree() {
		for (Car car : cars) {
			if (car.getBody().getBodyColor() == BodyColor.RED) {
				car.getHandlebar().setMaterial("Alcantara");
				System.out.println("Material of Handlebar has changed!" + car);
			}
		}
	}

	private void taskFour() {
		for (Car car : cars) {
			if (car.getHandlebar().isHasButton() == true) {
				car.getWheel().setDiameterOfWheel((car.getWheel().getDiameterOfWheel()) * 2);
				System.out.println("Diameter of wheels has changed to x2!" + car);
			}
		}
	}

	private void taskFive() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter diameter for changes:");
		int inputDiameter = scanner.nextInt();
		for (Car car : cars) {
			if (car.getWheel().getDiameterOfWheel() < inputDiameter) {
				car.changeCarToCommon();
				System.out.println("Car has changed to Common!" + car);
			}
		}
	}
	
	private void taskSix(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter body type what you want to find:");
		BodyType inputBodyType = BodyType.valueOf(scanner.next().toUpperCase());
		for (Car car : cars) {
			if (car.getBody().getBodyType() == inputBodyType) {
				System.out.println(car);
			}
		}
	}
	
	private void taskSeven(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter body color what you wanna to delete:");
		BodyColor inputBodyColor = BodyColor.valueOf(scanner.next().toUpperCase());
		Iterator<Car> iterCar = cars.iterator();
		while(iterCar.hasNext()){
			Car temp = iterCar.next();
			if (temp.getBody().getBodyColor()==inputBodyColor) {
				iterCar.remove();
			}
		}
		System.out.println("Cars with body color- "+inputBodyColor+" have deleted from list" );
	}
	
	
	private void taskEight(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter diameter for wheels type changes, from:");
		int inputDiameter1 = scanner.nextInt();
		System.out.println("Enter diameter for wheels type changes, to:");
		int inputDiameter2 = scanner.nextInt();
		for (Car car : cars) {
			if ((car.getWheel().getDiameterOfWheel() >= inputDiameter1)&&(car.getWheel().getDiameterOfWheel() <= inputDiameter2)) {
				car.getWheel().changeWheelsType();
				System.out.println("Wheels type has changed " + car);
			}
		}
	}
	
	
	private void taskNine(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter body type what you want to delete");
		BodyType inputBodyType = BodyType.valueOf(scanner.next().toUpperCase());
		System.out.println("Enter diameter of handlebar what you want to delete, from:");
		int inputHandlebarDiameter1 = scanner.nextInt();
		System.out.println("Enter diameter of handlebar what you want to delete, to:");
		int inputHandlebarDiameter2 = scanner.nextInt();
		Iterator<Car> iterCar2 = cars.iterator();
		while(iterCar2.hasNext()){
			Car temp = iterCar2.next();
			if ((temp.getBody().getBodyType()==inputBodyType)&&(temp.getHandlebar().getHandleBarDiameter() >= inputHandlebarDiameter1)&&(temp.getHandlebar().getHandleBarDiameter() <= inputHandlebarDiameter2)) {
				iterCar2.remove();
				System.out.println("Car has deleted");
			}
		}
		System.out.println("Cars who have body type "+inputBodyType+" and handlebar diameter from "+inputHandlebarDiameter1+" to "+inputHandlebarDiameter2+" have deleted form list");
	}
	
	private void taskTen(){
		List<Integer> integersIndexes = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter body type what you want to remind and show indexes of:");
		BodyType inputBodyType = BodyType.valueOf(scanner.next().toUpperCase());
		for (Car car : cars) {
			if (car.getBody().getBodyType() == inputBodyType) {
				integersIndexes.add(cars.indexOf(car));
			}
		}
		System.out.println("Indexes of cars with "+inputBodyType+" body type:");
		System.out.println(integersIndexes);
	}
}
