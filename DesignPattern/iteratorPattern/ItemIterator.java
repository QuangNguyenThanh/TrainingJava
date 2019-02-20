package iteratorPattern;

public interface ItemIterator<T> {
	boolean hasNext();
	T next();
}
