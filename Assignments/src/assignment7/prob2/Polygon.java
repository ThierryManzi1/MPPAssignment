package assignment7.prob2;

public interface Polygon extends ClosedCurve {
	public double[] getSides();
	
	default double computePerimeter() {
		double perimeter = 0.0;
		for(double x:getSides()) {
			perimeter+=x;
	
		}
		return perimeter;
	}

}
