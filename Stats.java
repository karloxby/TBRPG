
/**
 * Represents stats and stat scaling for Characters.
 */
public class Stats {
	
	private int strength;
	private int agility;
	private int intelligence;

	public Stats(int strength, int agility, int intelligence) {
		this.strength = strength;
		this.agility = agility;
		this.intelligence = intelligence;
	}

	public int getStrength() {
		return strength;
	}

	public int getAgility() {
		return agility;
	}

	public int getIntelligence() {
		return intelligence;
	}
}

