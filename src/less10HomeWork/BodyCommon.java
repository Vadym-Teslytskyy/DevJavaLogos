package less10HomeWork;

public class BodyCommon{

	private final BodyColor bodyColorCommon = BodyColor.WHITE;
	private BodyColor bodyColor;
	private BodyType bodyType;



	public BodyCommon(BodyColor bodyColor, BodyType bodyType) {
		this.bodyColor = bodyColor;
		this.bodyType = bodyType;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bodyColor == null) ? 0 : bodyColor.hashCode());
		result = prime * result + ((bodyType == null) ? 0 : bodyType.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof BodyCommon))
			return false;
		BodyCommon other = (BodyCommon) obj;
		if (bodyColor != other.bodyColor)
			return false;
		if (bodyType != other.bodyType)
			return false;
		return true;
	}



	public BodyType getBodyType() {
		return bodyType;
	}


	public void setBodyType(BodyType bodyType) {
		this.bodyType = bodyType;
	}


	public BodyColor getBodyColor() {
		return bodyColor;
	}


	public void setBodyColor(BodyColor bodyColor) {
		this.bodyColor = bodyColor;
	}


	public void doSomethingWithBody() {
		if (bodyColor!=bodyColorCommon) {
			bodyColor=bodyColorCommon;
			System.out.println("Changed to:");
			printInfo();
		}else {
			System.out.println("Color of body is allready white");
		}
	}
	
	
	public void printInfo() {
		System.out.println(toString());
	}



	@Override
	public String toString() {
		return "BodyCommon [bodyColor=" + bodyColor + ", bodyType=" + bodyType + "]";
	}
	
	
}
