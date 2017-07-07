package less09_01;

public class Circle implements Figure {

	private final int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double square() {
		return Math.PI * radius * radius;
	}

	@Override
	public double perimetr() {
		return Math.PI * 2 * radius;
	}
}
