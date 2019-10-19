package assignment8.Day1.prob2.taskD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductInfo {
	
	public static void  sort(List<Product> prod) {
		
		Collections.sort(prod, (p1,p2)->{
			if(!(p1.title.equals(p2.title))) {
				return p1.title.compareTo(p2.title);
			}else {
				return Integer.compare(p1.model, p2.model);
			}
		});
	
	}
	public static void main(String[] args) {
		List<Product> prod = new ArrayList<>();
		prod.add(new Product("Galaxy", 500.0,3));
		prod.add(new Product("Galaxy", 1500.0,2));
		prod.add(new Product("HP", 1800.0,6));
		prod.add(new Product("Toshiba", 1800.0,6));
		
		sort(prod);
		System.out.println(prod);
		
	}

	}


