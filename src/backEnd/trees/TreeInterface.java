package backEnd.trees;

public interface TreeInterface<E> extends Iterable<E> {
	boolean add(E e);
	void clear();
	boolean contains(E e);
	E get(E e);
	boolean isEmpty();
	boolean remove(E e);
	int size();

}
