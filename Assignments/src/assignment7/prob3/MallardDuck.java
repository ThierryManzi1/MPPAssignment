package assignment7.prob3;

public class MallardDuck extends Duck {
	
	@Override
	public void display() {
		System.out.println(" displaying");
		
		
	}
	public void fly() {
		super.flyWithWings();
	}
	public void quack() {
		super.quacking();
	}
	

}
