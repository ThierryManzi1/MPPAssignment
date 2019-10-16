package assignment7.prob2;

public class Circle implements ClosedCurve{
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}


	@Override
	public double computePerimeter() {
		return Math.PI*(2*radius);
	}
}
