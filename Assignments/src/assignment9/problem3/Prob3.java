package assignment9.problem3;

import java.util.Arrays;
import java.util.List;

public class Prob3 {

	public static void main(String[] args) {
		Prob3 p = new Prob3();
		List<String> words = Arrays.asList("java","design parten","mpp","computer","computer","dell");
		int count =p.countWords(words, 'c', 'd', 8);
		System.out.println(count);
	}
	 public int countWords(List<String> words, char c, char d, int len) {
		
		 return (int) words.stream()
		 .filter(w-> w.length()==len)
		 .filter(w->!(w.contains(""+d)))
		 .filter(w->w.contains(""+c))
		 .count();
	 }

}
