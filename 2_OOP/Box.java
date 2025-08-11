public class Box<T> {
	T item;

	public Box(T item) {
		this.item = item;
	}

	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
}
