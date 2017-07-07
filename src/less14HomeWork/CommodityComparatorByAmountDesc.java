package less14HomeWork;

import java.util.Comparator;

public class CommodityComparatorByAmountDesc implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		return Integer.compare(o2.getAmount(), o1.getAmount());
	}

}
