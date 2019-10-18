package assignment8.Day1.prob2.taskD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductInfo {
	static enum SortMethod {BYPRICE, BYTITLE};
	SortMethod method;
	
	public static void  sort(List<Product> prod, SortMethod method) {
		
		Collections.sort(prod, (p1,p2)->{
			if( method == SortMethod.BYPRICE) {
				return Double.compare(p1.price, p2.price);
			}else {
				return p1.title.compareTo(p2.title);
			}
		});
	
	}
	public static void main(String[] args) {
		List<Product> prod = new ArrayList<>();
		prod.add(new Product("Galaxy", 500.0,3));
		prod.add(new Product("Mac", 1500.0,4));
		prod.add(new Product("HP", 1800.0,6));
		
		
		ProductInfo.sort(prod, SortMethod.BYPRICE);
		
		System.out.println(prod);
		
		ProductInfo.sort(prod, SortMethod.BYTITLE);
		System.out.println(prod);
		
		
		
	
		
	
		
	}

	}


