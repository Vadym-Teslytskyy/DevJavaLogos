package less14HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Commodity> commodities = new ArrayList<>();
		FunctionalCommodityMenu functionalCommodityMenu = new FunctionalCommodityMenu(commodities);
		functionalCommodityMenu.startFunctionalCommodityMenu();
	}

}
