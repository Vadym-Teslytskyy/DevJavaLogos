package less14HomeWork;

import java.util.Comparator;

public class CommodityComparatorByCategoryAsc implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		return o1.getCommodityCategory().compareTo(o2.getCommodityCategory());
	}

}
