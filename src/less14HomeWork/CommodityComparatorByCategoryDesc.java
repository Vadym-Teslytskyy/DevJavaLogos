package less14HomeWork;

import java.util.Comparator;

public class CommodityComparatorByCategoryDesc implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		return o2.getCommodityCategory().compareTo(o1.getCommodityCategory());
	}

}
