package assignment9.problem5;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Section {
	public static Stream<String> streamSection(Stream<String> stream, int m, int n){
		return stream.skip(m)
				.limit(n-m+1);
	}

	public static void main(String[] args) {
		Stream<String> result = streamSection(nextStream(),2,5);
		System.out.println(result.collect(Collectors.toList()));

	}
	private static Stream<String> nextStream() {   
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii")
				.stream();  
		} 

}
