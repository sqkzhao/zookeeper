package zookeeper;

public class Bat extends Mammal {
	
	public Bat() {
		super(300);
	}
	
	public void fly() {
		System.out.println("taking off sound...");
		setEnergyLevel(getEnergyLevel() - 50);
	}
	
	public void eatHumans() {
		System.out.println("well, never mind");
		setEnergyLevel(getEnergyLevel() + 25);
	}
	
	public void attackTown() {
		System.out.println("ahhhhhh~");
		setEnergyLevel(getEnergyLevel() - 100);
	}
	
}
