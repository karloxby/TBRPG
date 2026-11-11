
/**
 * Represents a character in the RPG.
 */
public class Character {

	private String name;
	private int health = 100;
	private int level = 1;

	public Character(String name) {
		this.name = name;
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
	
	/**
	 * Reduces the character's health by a specified amount.
	 *
	 * @param damage the amount of damage received
	 */
	public int takeDamage(int damage) {
		health = health - damage;
		
		if (health < 0) {
			health = 0;
		}

		return health;
	}

	/**
	 * Increases the character's health by a specified amount.
	 *
	 * @param heal the amount of health restored
	 */
	public int heal(int heal) {
		health = health + heal;

		if (health > 100) {
			health = 100;
		}

		return health;
	}
	
	/**
	 * Attacks another character, dealing 10 damage.
	 *
	 * @param target the character receiving the attack
	 */
	public void attack(Character target) {
		target.takeDamage(10);
	}
}

