package assignment7.prob3;

public class DecoyDuck extends Duck {

	@Override
	public void display() {
		System.out.println(" displaying");
		
		
	}
	public void fly() {
		super.cannotFly();
		
	}
	public void quack() {
		super.mutequack();
	}

}
