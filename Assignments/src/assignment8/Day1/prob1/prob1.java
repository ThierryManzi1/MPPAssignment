package assignment8.Day1.prob1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class prob1 {
	public static void main(String[] args) {
		BiFunction<Double,Double, List<Double>> bi = (x,y) -> {     
			List<Double> list = new ArrayList<>();    
			list.add(Math.pow(x,y));     
			list.add(x * y);     
			return list; 
			}; 			
		List<Double> test = bi.apply(2.0, 3.0);
		System.out.println(test);
	}

}
//Output: [8.0, 6.0]