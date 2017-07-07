package less09_01;

public interface Figure {

	double square();

	double perimetr();

	public default void print() {
		System.out.println("Perimetr = " + this.perimetr() + " square = " + this.square());
	}
}
