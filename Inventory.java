
import java.util.ArrayList;

/**
 * Represents the hero's inventory of items.
 */
public class Inventory {

	private ArrayList<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
	}

	public void removeItem(Item item) {
		items.remove(item);
	}

	public int getItemCount() {
		return items.size();
	}
}

