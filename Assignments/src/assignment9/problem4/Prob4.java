package assignment9.problem4;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Prob4 {

	public static void main(String[] args) {
		printSquares(4);

	}
	public static void printSquares(int num) {
		IntStream nums = IntStream.iterate(1, n->(n+1))
				.map(n->n*n)
				.limit(num);
       System.out.println(nums.mapToObj(Integer::toString).collect(Collectors.joining(",")));
	}

}
