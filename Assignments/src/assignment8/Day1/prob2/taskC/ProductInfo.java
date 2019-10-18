package assignment8.Day1.prob2.taskC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ProductInfo {
	static enum SortMethod {BYPRICE, BYTITLE};
	SortMethod method;
	public void  sort(List<Product> prod, SortMethod method) {
		class ProductComparator implements Comparator<Product>{
			@Override
			public int compare(Product p1, Product p2) {
				if( method == SortMethod.BYPRICE) {
					return Double.compare(p1.price, p2.price);
				}else {
					return p1.title.compareTo(p2.title);
				}
			}
			}
		Collections.sort(prod, new ProductComparator());
	
	}
	public static void main(String[] args) {
		List<Product> prod = new ArrayList<>();
		prod.add(new Product("Galaxy", 500.0,3));
		prod.add(new Product("Mac", 1500.0,4));
		prod.add(new Product("HP", 1800.0,6));
		
		ProductInfo pi = new ProductInfo();
	
		pi.sort(prod, SortMethod.BYPRICE);
		
		System.out.println(prod);
		
		pi.sort(prod, SortMethod.BYTITLE);
		System.out.println(prod);
			
	}

	}


