package assignment8.Day1.prob2.taskAandB;

import java.util.Comparator;

public class ProductTitleComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return p1.title.compareTo(p2.title);
	}

}
