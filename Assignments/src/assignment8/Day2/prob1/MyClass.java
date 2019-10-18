package assignment8.Day2.prob1;

import java.util.function.Function;

public class MyClass {
	private String a;
	private int b;
	
	public MyClass(String a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if(!(obj instanceof MyClass)) return false;
		MyClass p = (MyClass)obj;
		boolean isEquals = a.equals(p.a) && b==p.b;
		return isEquals;
	}	
	public void myMethod(MyClass ob) {
		Function<MyClass, Boolean> f = this::equals;
		System.out.println(f.apply(ob));
		}
}
