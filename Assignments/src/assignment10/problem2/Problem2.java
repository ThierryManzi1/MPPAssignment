package assignment10.problem2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem2 {

	public static void main(String[] args) {
		List<Integer> intlist = Arrays.asList(14,20,7,47,60,4);
        System.out.println(secondSmallest(intlist));

	}
	public static <T> T secondSmallest(List<? extends T> list) throws IndexOutOfBoundsException{
        List<T> sort = list.stream().sorted()
                .collect(Collectors.toList());
        return sort.get(1);

}

}
