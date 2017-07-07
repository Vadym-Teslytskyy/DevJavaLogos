package less10HomeWork;

public class Car {

	private WheelCommon wheel;
	private BodyCommon body;
	private HandlebarCommon handlebar;
	

	public Car(WheelCommon wheel, BodyCommon body, HandlebarCommon handlebar) {
		this.wheel = wheel;
		this.body = body;
		this.handlebar = handlebar;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((body == null) ? 0 : body.hashCode());
		result = prime * result + ((handlebar == null) ? 0 : handlebar.hashCode());
		result = prime * result + ((wheel == null) ? 0 : wheel.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Car))
			return false;
		Car other = (Car) obj;
		if (body == null) {
			if (other.body != null)
				return false;
		} else if (!body.equals(other.body))
			return false;
		if (handlebar == null) {
			if (other.handlebar != null)
				return false;
		} else if (!handlebar.equals(other.handlebar))
			return false;
		if (wheel == null) {
			if (other.wheel != null)
				return false;
		} else if (!wheel.equals(other.wheel))
			return false;
		return true;
	}


	public WheelCommon getWheel() {
		return wheel;
	}


	public void setWheel(WheelCommon wheel) {
		this.wheel = wheel;
	}


	public BodyCommon getBody() {
		return body;
	}


	public void setBody(BodyCommon body) {
		this.body = body;
	}


	public HandlebarCommon getHandlebar() {
		return handlebar;
	}


	public void setHandlebar(HandlebarCommon handlebar) {
		this.handlebar = handlebar;
	}


	public void doSomethingWithBody() {
		if (body != null)
			body.doSomethingWithBody();
	}

	public void doSomethingWithWheel() {
		if (wheel != null)
			wheel.doSomethingWithWheel();
	}

	public void doSomethingWithHandlebar() {
		if (handlebar != null)
			handlebar.doSomethingWithHandlebar();
	}

	public void changeCarToCommon() {
		System.out.println("Car is changing to common.....");
		doSomethingWithBody();
		doSomethingWithWheel();
		doSomethingWithHandlebar();
		System.out.println("Car changed to common!");
	}


	@Override
	public String toString() {
		return "Car [wheel=" + wheel + ", body=" + body + ", handlebar=" + handlebar + "]";
	}

	
}
