package less10HomeWork;

public class WheelCommon{

	private final int diameterCommon=15;
	private int diameterOfWheel;
	private WheelType wheelType;

	
	public WheelCommon(int diameterOfWheel, WheelType wheelType) {
		if ((diameterOfWheel>=10)&&(diameterOfWheel<=30)) {
			this.diameterOfWheel = diameterOfWheel;
		}else{
			throw new Error("diameterOfWheel must be >=10 and <=30!!!");
		}
		this.wheelType = wheelType;
	}
	
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diameterOfWheel;
		result = prime * result + ((wheelType == null) ? 0 : wheelType.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof WheelCommon)) return false;
		WheelCommon other = (WheelCommon) obj;
		if (diameterOfWheel != other.diameterOfWheel) return false;
		if (wheelType != other.wheelType) return false;
		return true;
	}




	public WheelType getWheelType() {
		return wheelType;
	}


	public void setWheelType(WheelType wheelType) {
		this.wheelType = wheelType;
	}


	public int getDiameterOfWheel() {
		return diameterOfWheel;
	}



	public void setDiameterOfWheel(int diameterOfWheel) {
		this.diameterOfWheel = diameterOfWheel;
	}



	public void doSomethingWithWheel() {
		if (diameterOfWheel!=diameterCommon) {
			diameterOfWheel=diameterCommon;
			System.out.println("Changed to:");
			printInfo();
		}else {
			System.out.println("Diametr of wheel is allready 15");
		}
	}

	
	public void printInfo() {
		System.out.println(toString());
	}
	
	public void changeWheelsType(){
		if (wheelType==WheelType.SUMMER) {
			wheelType = WheelType.WINTER;
		}else {
			wheelType = WheelType.SUMMER;
		}
	}


	@Override
	public String toString() {
		return "WheelCommon [diameterOfWheel=" + diameterOfWheel + ", wheelType=" + wheelType + "]";
	}
	
	
}
