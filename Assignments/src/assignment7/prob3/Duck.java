package assignment7.prob3;

public abstract class Duck implements Flyable, Quackable {
	
	
	public abstract void display();
	public void swim() {
		System.out.println(" swimming");
	}
	public abstract void fly();
	public abstract void quack();

}
