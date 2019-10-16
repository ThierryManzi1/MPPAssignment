package assignment7.prob2;

public class EqTriangle implements Polygon {
	private double side;
	private double [] sides= new double [3];

	public EqTriangle(double side) {
		this.side = side;
		sides[0]= side;
		sides[1]= side;
		sides[2]= side;
	}

	@Override
	public double[] getSides() {
		return sides;
	}
	

}
