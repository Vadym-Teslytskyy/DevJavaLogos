package less06HomeWork;

import java.util.Scanner;

public class Car {

	String color; // колір
	String brand; // марка
	double consumption; // розхід
	double fuelVolume = 20.0; // об'єм пального в баку
	double tankCapacity = 60.0; // об'єм баку
	double mileage = 100.0; // пробіг
	private int km;

	Car(String color, String brand, double consumption) {
		this.color = color;
		this.brand = brand;
		this.consumption = consumption / 100;
	}

	void drive() {
		System.out.println("Enter how many km you going to drive?");
		Scanner scanner = new Scanner(System.in);
		km = scanner.nextInt();
		double enough = (double) km * consumption;
		if (fuelVolume == 0.0) {
			System.out.println("Need refuel!!!");
		}
		if (enough <= fuelVolume) {
			fuelVolume -= enough;
			mileage = (double) mileage + km;
			distance();
		} else {
			double volume = fuelVolume;
			mileage += (volume / consumption); // пробіг+на скільки км вистачило
												// пального
			fuelVolume -= fuelVolume;
			System.out.println("Car drive only: " + (volume / consumption) + "km");
			distance();
		}
		System.out.println();
		startProgram();
	}

	void reFuel() {
		System.out.println("Enter how many liters of fuel you going to refuel?");
		Scanner scanner = new Scanner(System.in);
		int fuelVolume = scanner.nextInt();
		if ((this.fuelVolume+fuelVolume)<=tankCapacity) {
			this.fuelVolume += (double) fuelVolume;
		} else {
			System.out.println("You refuel only: "+(tankCapacity-this.fuelVolume)+"liters"+" because tank is full!");
			this.fuelVolume+=(tankCapacity-this.fuelVolume);
		}
		System.out.println();
		distance();
		System.out.println();
		startProgram();
	}

	void distance() {
		System.out.println("Brand: " + brand + " Color: " + color + " Consumption/100km: " + consumption + "liters");
		System.out.println("Tank Capacity: " + tankCapacity + "liters" + " FuelVolume: " + fuelVolume + "liters"
				+ " Mileage: " + mileage + "km");
	}

	void startProgram() {
		System.out.println("If you wanna drive enter 'd' or 'r' if you wanna to refuel!");
		Scanner scanner = new Scanner(System.in);
		String res = scanner.nextLine();
		if (res.contains("r"))
			reFuel();
		if (res.contains("d"))
			drive();
	}
}
