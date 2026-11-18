
/**
 * Represents the playable hero in the RPG.
 */
public class Hero extends Character {

	private Inventory inventory;
	private int mana = 100;

	public Hero(String name, Stats stats) {
		super(name, stats);
		this.inventory = new Inventory();
	}

	public void pickUpItem(Item item) {
		inventory.addItem(item);
	}

	public void dropItem(Item item) {
		inventory.removeItem(item);
	}

	public int getItemCount() {
		return inventory.getItemCount();
	}

	public int getMana() {
		return mana;
	}
}

