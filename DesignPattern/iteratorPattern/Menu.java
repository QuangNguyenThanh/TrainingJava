package iteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private List<Item> menuItems = new ArrayList<>();
	
	public void addItem(Item item) {
		menuItems.add(item);
	}
	
	public ItemIterator<Item> iterator() {
		return new MenuItemIterator();
	}
	
	class MenuItemIterator implements ItemIterator<Item> {
		private int currentIndex = 0;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return currentIndex < menuItems.size();
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			return menuItems.get(currentIndex++);
		}
	}
}
