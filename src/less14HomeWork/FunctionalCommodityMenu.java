package less14HomeWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FunctionalCommodityMenu {
	List<Commodity> commodities = new ArrayList<>();
	
	
	public FunctionalCommodityMenu(List<Commodity> commodities) {
		this.commodities = commodities;
	}

	public void startFunctionalCommodityMenu(){
		Scanner scanner = new Scanner(System.in);
		boolean isRun = true;
		while (isRun) {
			System.out.println("Enter '0' to show list or enter '1' to enter commodity or '2' to open delete menu or '3' to change commodity or '4' to open sort menu or 'q' to exit");
			String inputMenuAction = scanner.next();
			switch (inputMenuAction) {
			case "0":{
				for (Commodity commodity : commodities) {
					System.out.println(commodity);
				}
			}break;
			case "1":{
				addCommodity();
			}
				break;
			case "2":{
				deleteListMenu(commodities);
			}
				break;
				
			case "3":{
				changeCommodity();
			}
				break;
			case "4":{
				sortMenu();
			}break;
				
			case "q": {
				isRun = false;
			}
				break;

			default:
				System.out.println("Error input! Try again!");
				break;
			}
		}
	}
	
	private void addCommodity(){
		Scanner scanner =	new Scanner(System.in); 
		System.out.println("Enter category(values: SOFTWARE, HARDWARE, COMPUTERS, PERIPHERY):");
		CommodityCategory inputCategory =CommodityCategory.valueOf(scanner.next().toUpperCase());
		System.out.println("Enter commodity name:");
		String inputName = scanner.next();
		System.out.println("Enter commodity amount(it must be >=0)!");
		int inputAmount = scanner.nextInt();
		
		Commodity commodity = new Commodity(inputName, inputCategory, inputAmount);
		commodities.add(commodity);
	}
	
	private void deleteListMenu(List<Commodity> commodities){
		System.out.println("Choose format of deleting: '1' delete by some input attributes or '2' delete by less amount(all commodities which < entered amount will delete) or 'q' toexit from delete menu!");
		Scanner scanner = new Scanner(System.in);
		boolean isRun= true;
		String inputFormat = scanner.next();
		switch (inputFormat) {
		case "1":{
			System.out.println("Enter category(values: SOFTWARE, HARDWARE, COMPUTERS, PERIPHERY) to delete:");
			CommodityCategory inputCategory =CommodityCategory.valueOf(scanner.next().toUpperCase());
			System.out.println("Enter commodity name to delete:");
			String inputName = scanner.next();
			System.out.println("Enter commodity amount(it must be >=0)! to delete:");
			int inputAmount = scanner.nextInt();
			int count = 0;
			
					Iterator<Commodity> iterator = commodities.iterator();
					while (iterator.hasNext()) {
						Commodity commodity = (Commodity) iterator.next();
						if ((commodity.getCommodityCategory()==inputCategory)
								&&(commodity.getCommodityName().equals(inputName))
								&& (commodity.getAmount()==inputAmount)) {
							iterator.remove();
							count++;
						}
				}
					System.out.println(count+" commodities have deleted!");
			
		}
			break;
		case "2": {
			System.out.println("Enter limit of amount:");
			int inputLimitAmount = scanner.nextInt();
			Iterator<Commodity> iterator = commodities.iterator();
			while (iterator.hasNext()) {
				Commodity commodity = (Commodity) iterator.next();
				if (commodity.getAmount()<=inputLimitAmount) {
					iterator.remove();
				}
			}
			System.out.println("Commodities which amount <= "+inputLimitAmount+" have deleted.");
		}
			break;
		case "q": {
			isRun = false;
		}
			break;

		default:
			System.out.println("Error input! Try again!");
			break;
		}
	}
	
	private void changeCommodity(){
		System.out.println("Choose agruments for commodity(ies) what you wanna to change:");
		System.out.println("'1' to change all with same category or '2' to change all with same name");
		Scanner scanner = new Scanner(System.in);
		String inputChangeType = scanner.next();
		switch (inputChangeType) {
		case "1":{
			System.out.println("Choose category:(values: SOFTWARE, HARDWARE, COMPUTERS, PERIPHERY)");
			CommodityCategory category = CommodityCategory.valueOf(scanner.next().toUpperCase());
			for (Commodity commodity : commodities) {
				if (commodity.getCommodityCategory()==category) {
					System.out.println(commodity);
					System.out.println("If you want to change name press '1' or '2' to change amount! or '0' not to change");
					String inputChangeType2 = scanner.next();
					switch (inputChangeType2) {
					case "1":{
						System.out.println("Type new name:");
						String newName = scanner.next();
						commodity.setCommodityName(newName);
						System.out.println("Name has changed to "+newName);
					}
						break;
					case "2":{
						System.out.println("Type new amount:");
						int newAmount = scanner.nextInt();
						commodity.setAmount(newAmount);
						System.out.println("Amount has changed to "+newAmount);
					}
						break;
					case "0":{
						System.out.println("Not changes.");
					}
						break;

					default:
						break;
					}
				}
			}
		}
			break;
			
			case "2":{
				System.out.println("Enter name:");
				String inputName = scanner.next();
				for (Commodity commodity : commodities) {
					if (commodity.getCommodityName().equals(inputName)) {
						System.out.println(commodity);
						System.out.println("If you want to change category press '1' or '2' to change amount! or '0' not to change");
						String inputChangeType2 = scanner.next();
						switch (inputChangeType2) {
						case "1":{
							System.out.println("Type new category(values: SOFTWARE, HARDWARE, COMPUTERS, PERIPHERY):");
							CommodityCategory newCategory =CommodityCategory.valueOf(scanner.next().toUpperCase());
							commodity.setCommodityCategory(newCategory);
							System.out.println("Category has changed to "+newCategory);
						}
							break;
						case "2":{
							System.out.println("Type new amount:");
							int newAmount = scanner.nextInt();
							commodity.setAmount(newAmount);
							System.out.println("Amount has changed to "+newAmount);
						}
							break;
						case "0":{
							System.out.println("Not changes.");
						}
							break;

						default:
							break;
						}
					}
				}
			}break;

		default:
			break;
		}
	}
	
	private void sortMenu(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose atribute for sorting:");
		System.out.println("'1' to sort by category or '2' to sort by name or '3' to sort by amount");
		String inputSortType = scanner.next();
		switch (inputSortType) {
		case "1":{
			System.out.println("Enter '1' to sort in ascending order or '2' to sort In descending order");
			String inputSortType2 = scanner.next();
			switch (inputSortType2) {
			case "1":{
				commodities.sort(new CommodityComparatorByCategoryAsc());
				System.out.println("Sorting by category in ascendig order is complete!");
			}
				break;
			case "2":{
				commodities.sort(new CommodityComparatorByCategoryDesc());
				System.out.println("Sorting by category in descending order is complete!");
			}
				break;
			default:
				break;
			}
		}
			break;
		case "2":{
			System.out.println("Enter '1' to sort in ascending order or '2' to sort In descending order");
			String inputSortType2 = scanner.next();
			switch (inputSortType2) {
			case "1":{
				commodities.sort(new CommodityComparatorByNameAsc());
				System.out.println("Sorting by name in ascendig order is complete!");
			}
				break;
			case "2":{
				commodities.sort(new CommodityComparatorByNameDesc());
				System.out.println("Sorting by name in descending order is complete!");
			}
				break;
			default:
				break;
			}
		}
			break;
		case "3":{
			System.out.println("Enter '1' to sort in ascending order or '2' to sort In descending order");
			String inputSortType2 = scanner.next();
			switch (inputSortType2) {
			case "1":{
				commodities.sort(new CommodityComparatorByAmountAsc());
				System.out.println("Sorting by amount in ascendig order is complete!");
			}
				break;
			case "2":{
				commodities.sort(new CommodityComparatorByAmountDesc());
				System.out.println("Sorting by amount in descending order is complete!");
			}
				break;
			default:
				break;
			}
		}
			break;

		default:
			break;
		}
	}
	
	
}
