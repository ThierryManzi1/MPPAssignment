package assignment8.Day2.prob1;

public class Driver {

	public static void main(String[] args) {
		MyClass m1 = new MyClass("Java", 1);
		MyClass m2 = new MyClass("Java", 1);
		MyClass m3 = new MyClass("Java", 2);
		MyClass m4 = new MyClass("C++", 3);
		MyClass m5 = new MyClass("C++", 3);
		
		m1.myMethod(m2); //true
		m1.myMethod(m3); //false
		m2.myMethod(m4); // false
		m4.myMethod(m5); //true
		

	}

}
