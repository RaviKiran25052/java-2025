public class Box<Thing> {
	Thing[] item;

	public Box(Thing[] item) {
		this.item = item;
	}

	public Thing getItem(int index) {
		if (index < 0 || index >= item.length) {
			throw new IndexOutOfBoundsException("Index out of bounds: " + index);
		}
		return item[index];
	}

	public void addItem(Thing item) {
		Thing[] newItemArray = java.util.Arrays.copyOf(this.item, this.item.length + 1);
		newItemArray[this.item.length] = item;
		this.item = newItemArray;
	}
}
