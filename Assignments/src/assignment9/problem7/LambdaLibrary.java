package assignment9.problem7;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaLibrary {
	
	 public static Function<List<Employee>,String> NAMES_OF_EMPLOYEE =
			 emps->emps.stream()
				.filter(e->e.getSalary()>100000)
				.filter(e->e.lastName.charAt(0)>'M')
				.sorted((e1,e2)->e1.firstName.compareTo(e2.firstName))
				.map(e->e.firstName+" "+e.lastName)
				.collect(Collectors.joining(","));
     
}


