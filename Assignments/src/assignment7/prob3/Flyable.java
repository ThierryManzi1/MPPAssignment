package assignment7.prob3;

public interface Flyable {
	default void flyWithWings() {
		System.out.println(" fly with wings");
	}
	default void cannotFly() {
		System.out.println(" cannot fly");
	}

}
