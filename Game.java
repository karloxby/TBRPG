
public class Game {
	public static void main(String[] args) {
		Character hero = new Character("Aerivos");
		Character enemy = new Character("Goblin");

		while (hero.getHealth() > 0 && enemy.getHealth() > 0) {
			hero.attack(enemy);
			System.out.printf("%s attacks %s!%n",
					hero.getName(), enemy.getName());
			System.out.printf("%s HP: %d%n",
					enemy.getName(), enemy.getHealth());

			if (enemy.getHealth() != 0) {
				enemy.attack(hero);	
				System.out.printf("%s attacks %s!%n",
						enemy.getName(), hero.getName());
				System.out.printf("%s HP: %d%n",
						hero.getName(), hero.getHealth());
			}
		}

		if (enemy.getHealth() == 0) {
			System.out.println(hero.getName() + " wins!");
		} else {
			System.out.println("You died.");
		}
	}
}

