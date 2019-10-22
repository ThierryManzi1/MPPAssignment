package assignment9.problem6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Prob6 {

	public static void main(String[] args) {
		Prob6 p = new Prob6();
		List<Set<String>> list = new ArrayList<>();
		Set<String>set1 = new LinkedHashSet<>(Arrays.asList("A","B"));
		Set<String>set2 = new LinkedHashSet<>(Arrays.asList("D"));
		Set<String>set3= new LinkedHashSet<>(Arrays.asList("1","3","5"));
		list.add(set1);
		list.add(set2);
		list.add(set3);
		System.out.println(list);
		System.out.println(p.union(list));
		

	}
	public Set<String> union(List<Set<String>> sets) {
		Set<String> l = new LinkedHashSet<>();
		 return sets.stream() 
		 .reduce((l1, l2) -> {
		        l.addAll(l1);
		        l.addAll(l2);
		        return l;
		    }).get();
		
	}

}
