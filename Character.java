
/**
 * Represents a character in the RPG.
 */
public class Character {

	private String name;
	private int health = 100;
	private int level = 1;
	private Stats stats;

	public Character(String name, Stats stats) {
		this.name = name;
		this.stats = stats;
	}

	public String getName() {
		return name;
	}
	
	public int getHealth() {
		return health;
	}

	public int getLevel() {
		return level;
	}

	public Stats getStats() {
		return stats;
	}
}

