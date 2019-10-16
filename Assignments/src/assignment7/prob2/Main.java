package assignment7.prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<ClosedCurve> figures = new ArrayList<ClosedCurve>(Arrays.asList(new Circle(5), new Ellipse(2,4),new Rectangle(3,4),new EqTriangle(6)));
		double sum = 0.0;
		for(ClosedCurve fig: figures) {
			sum+=fig.computePerimeter();
			System.out.println("Perimeter of "+fig.getClass().getSimpleName()+" is: "+fig.computePerimeter());
		}
		System.out.println("Sum of Perimeters = "+sum);
	

	}

	

}
