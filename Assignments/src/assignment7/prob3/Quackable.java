package assignment7.prob3;

public interface Quackable {
	default void quacking() {
		System.out.println(" quacking");
	}
	default void squeak() {
		System.out.println(" squeaking");	
	}
	default void mutequack() {
		System.out.println(" cannot quack");
		
	}
	

}
