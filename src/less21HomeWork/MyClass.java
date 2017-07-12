package less21HomeWork;

public class MyClass {
	private String name;
	private int amount;
	private String category;
	
	
	
	public MyClass() {
	}

	public MyClass(String name, int amount, String category) {
		this.name = name;
		this.amount = amount;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "MyClass [name=" + name + ", amount=" + amount + ", category=" + category + "]";
	}
	
	
	
}
