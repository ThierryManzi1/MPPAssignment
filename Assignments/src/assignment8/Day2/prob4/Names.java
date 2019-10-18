package assignment8.Day2.prob4;

import java.util.Arrays;

public class Names {

	public static void main(String[] args) {
		String[] names =   {"Alexis", "Tim", "Kyleen", "KRISTY"}; 
		sort(names);
	}
	public static void sort(String [] arr) {
		Arrays.sort(arr, String :: compareToIgnoreCase);
		System.out.println(Arrays.toString(arr));
	
	}

}
