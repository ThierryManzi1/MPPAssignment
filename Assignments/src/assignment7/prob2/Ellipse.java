package assignment7.prob2;

public class Ellipse implements ClosedCurve {
	private double semiAxes;
	private double Einterval;
	public Ellipse(double semiAxes, double einterval) {
		this.semiAxes = semiAxes;
		Einterval = einterval;
	}
	@Override
	public double computePerimeter() {
		return 4*semiAxes*Einterval;
	}

}
