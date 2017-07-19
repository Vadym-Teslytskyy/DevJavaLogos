package less14HomeWork;

public class Commodity {
	private String commodityName;
	private CommodityCategory commodityCategory;
	private int amount;
	public Commodity(String commodityName, CommodityCategory commodityCategory, int amount) {
		this.commodityName = commodityName;
		this.commodityCategory = commodityCategory;
		if (amount>=0) {
			this.amount = amount;
		}else throw new Error("Error! incorrect field, amount must to be >=0!");
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public CommodityCategory getCommodityCategory() {
		return commodityCategory;
	}
	public void setCommodityCategory(CommodityCategory commodityCategory) {
		this.commodityCategory = commodityCategory;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Commodity [commodityName=" + commodityName + ", commodityCategory=" + commodityCategory + ", amount="
				+ amount + "]";
	}
	
	
	
}
