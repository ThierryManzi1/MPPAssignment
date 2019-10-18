package assignment8.Day2.prob2;

import java.util.function.Supplier;

public class RandomDriver {

	public static void main(String[] args) {
		printRandomLambda();      //i. using Lambda
		printRandomReference(); //ii. using method reference
		printRandomInnerClass(); // iii. using inner class

	}
	public static void printRandomLambda() {
		Supplier<Double> s = ()->Math.random();
		System.out.println(s.get());
	}
	
	public static void printRandomReference() {
		Supplier<Double> s1 = Math::random;
		System.out.println(s1.get());
	}
	
	public static void printRandomInnerClass() {
		class Inner implements Supplier<Double>{
			@Override
			public Double get() {
				return Math.random();
			}		
		}
		System.out.println(new Inner().get());
	}

}
