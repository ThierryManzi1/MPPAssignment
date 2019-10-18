package assignment8.Day1.prob2.taskAandB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ProductInfo {
	static enum SortMethod {BYPRICE, BYTITLE};
	SortMethod method;
	public static void  sort(List<Product> prod, SortMethod method) {
		if(method == SortMethod.BYPRICE) {
			Collections.sort(prod, new ProductPriceComparator());
		}
		else if(method == SortMethod.BYTITLE) {
			Collections.sort(prod, new ProductTitleComparator());
		}
	}
	public static void main(String[] args) {
		List<Product> prod = new ArrayList<>();
		prod.add(new Product("Galaxy", 500.0,3));
		prod.add(new Product("Mac", 1000.0,4));
		prod.add(new Product("HP", 1800.0,6));
		
		Collections.sort(prod, new ProductPriceComparator());
		System.out.println(prod);
		
		Collections.sort(prod, new ProductTitleComparator());
		System.out.println(prod);
		
		 sort(prod, SortMethod.BYPRICE);
		 System.out.println(prod);
		 
		 sort(prod, SortMethod.BYTITLE);
		 System.out.println(prod);
		 
	
		
	}

	}


