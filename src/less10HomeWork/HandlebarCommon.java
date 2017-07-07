package less10HomeWork;

public class HandlebarCommon{

	private final String materialCommon="leather";
	private String material;
	private boolean hasButton = true;
	private int handleBarDiameter;
	
	public HandlebarCommon(String material, boolean hasButton,int handleBarDiameter) {
		this.material = material;
		this.hasButton = hasButton;
		if ((handleBarDiameter>=20)&&(handleBarDiameter<=30)) {
			this.handleBarDiameter = handleBarDiameter;
		}else{
			throw new Error("handleBarDiameter must be >=20 and <=30!!!");
		}
	}


	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + handleBarDiameter;
		result = prime * result + (hasButton ? 1231 : 1237);
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof HandlebarCommon)) return false;
		HandlebarCommon other = (HandlebarCommon) obj;
		if (handleBarDiameter != other.handleBarDiameter) return false;
		if (hasButton != other.hasButton) return false;
		if (material == null) {
			if (other.material != null) return false;
		} else if (!material.equals(other.material)) return false;
		return true;
	}



	public int getHandleBarDiameter() {
		return handleBarDiameter;
	}



	public void setHandleBarDiameter(int handleBarDiameter) {
		this.handleBarDiameter = handleBarDiameter;
	}



	public String getMaterial() {
		return material;
	}



	public void setMaterial(String material) {
		this.material = material;
	}



	public boolean isHasButton() {
		return hasButton;
	}



	public void setHasButton(boolean hasButton) {
		this.hasButton = hasButton;
	}



	public void doSomethingWithHandlebar() {
		if (!material.equalsIgnoreCase(materialCommon)) {
			material = materialCommon;
			System.out.println("Changed to:");
			printInfo();
		}else {
			System.out.println("Handlebar is allready leather");
		}
		
		
	}
	public void printInfo() {
		System.out.println(toString());
	}



	@Override
	public String toString() {
		return "HandlebarCommon [material=" + material + ", hasButton=" + hasButton + ", handleBarDiameter="
				+ handleBarDiameter + "]";
	}


	
}
