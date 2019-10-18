package assignment8.Day2.prob3;

import java.util.Arrays;
import java.util.List;

public class FruitList {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums"); 
		fruits.forEach(f->System.out.println(f)); // using forEach with Lambdas 
		
		System.out.println("--------------------------");
		
		fruits.forEach(System.out::println); //using method reference 

	}

}
