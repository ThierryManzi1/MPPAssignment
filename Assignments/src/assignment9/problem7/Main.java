package assignment9.problem7;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		//a.
		System.out.println(fullName(list));
		//b.
		System.out.println(fullName2(list));

	}
	//a.
	public static String fullName(List<Employee>emps) {
		return  emps.stream()
		.filter(e->e.getSalary()>100000)
		.filter(e->e.lastName.charAt(0)>'M')
		.sorted((e1,e2)->e1.firstName.compareTo(e2.firstName))
		.map(e->e.firstName+" "+e.lastName)
		.collect(Collectors.joining(","));
		
	}
		
	//b.using lambdaLibrary
	public static String fullName2(List<Employee>emps) {
		return LambdaLibrary.NAMES_OF_EMPLOYEE.apply(emps);		
		
	}

}
