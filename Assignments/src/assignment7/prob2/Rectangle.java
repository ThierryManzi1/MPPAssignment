package assignment7.prob2;

public class Rectangle implements Polygon {
	private double length;
	private double width;
	private double[] sides= new double[4];
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		sides[0]=length;
		sides[1]= width;
		sides[2]=length;
		sides[3]= width;
	}

	@Override
	public double[] getSides() {
		return sides;
	}

}
