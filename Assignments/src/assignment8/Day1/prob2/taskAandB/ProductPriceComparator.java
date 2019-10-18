package assignment8.Day1.prob2.taskAandB;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {	
		return Double.compare(p1.price,p2.price);
	}

}
