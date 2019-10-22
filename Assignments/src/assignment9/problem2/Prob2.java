package assignment9.problem2;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Prob2 {

	public static void main(String[] args) {
		IntStream myIntStream = IntStream.of(12,15,2,6,8);
		IntSummaryStatistics summary = myIntStream.summaryStatistics();
		System.out.println("minimum= "+summary.getMin());
		System.out.println("maximum= "+summary.getMax());
		
		//output:minimum= 2
		//		 maximum= 15
	

	}

}
