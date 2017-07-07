package less14HomeWork;

import java.util.Comparator;

public class CommodityComparatorByNameDesc implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		return o2.getCommodityName().compareTo(o1.getCommodityName());
	}

}
