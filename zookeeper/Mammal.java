package zookeeper;

public class Mammal {
	private int energyLevel; 
	
	public Mammal() {
		this.energyLevel = 100;
	}
	
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	public int displayEnergy() {
		System.out.println(String.format("Current energy level: %d.", energyLevel));
		return energyLevel;
	}
}
