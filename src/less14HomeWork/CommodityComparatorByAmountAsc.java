package less14HomeWork;

import java.util.Comparator;

public class CommodityComparatorByAmountAsc implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		return Integer.compare(o1.getAmount(), o2.getAmount());
	}

}
