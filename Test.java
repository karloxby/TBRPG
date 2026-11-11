
public class Test {
	public static void main(String[] args) {
		Character hero = new Character("Aerivos");
		Character enemy = new Character("Goblin");
		
		hero.attack(enemy);
		if (enemy.getHealth() != 90) {
			throw new AssertionError("Expected target health to be 90.");
		}
		if (hero.getHealth() != 100) {
			throw new AssertionError("Expected attacker's health to be 100.");
		}

		enemy.heal(100);
		if (enemy.getHealth() != 100) {
			throw new AssertionError("Expected health to be 100.");
		}
	}
}

