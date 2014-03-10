package backEnd.trees;

import java.util.Iterator;

public class GenericTree<E extends Comparable <E>> implements TreeInterface<E> {
	
	Node root;
	Node current;
	Node setIn;
	int ant;
	
	public GenericTree(){
		ant = 0;
		root = null;
	}
	
	class Node{
		Node left;
		Node right;
		E object;
		
		Node(E e){
			this.object = e;
		}
	}
	
	
	@Override
	public Iterator<E> iterator() {
		// TODO Make iterator
		return null;
	}

	@Override
	public boolean add(E e) {
		setIn = new Node(e);
		if(isEmpty()){
			root = setIn;
			return true;
		}
		current = root;
		while(current != null){
			if(setIn.object.compareTo(current.object)<0){
				current = current.right;
			}else if(setIn.object.compareTo(current.object)>0){
				current = current.left;
			}else if(setIn.object.compareTo(current.object)==0){
				return false;
			}
		}
		current = setIn;
		return true;
	}

	@Override
	public void clear() {
		root = null;
	}

	@Override
	public boolean contains(E e) {
		setIn = new Node(e);
		current = root;
		while(current != null){
			if(setIn.object.compareTo(current.object)==0){
				return true;
			}else if(setIn.object.compareTo(current.object)<0){
				current = current.right;
			}else if(setIn.object.compareTo(current.object)>0){
				current = current.left;
			}
		}
		return false;
	}

	@Override
	public E get(E e) {
		if(contains(e)){
			setIn = new Node(e);
			current = root;
			while(current!=null){
				if(setIn.object.compareTo(current.object)<0){
					current = current.right;
				}else if(setIn.object.compareTo(current.object)>0){
					current = current.left;
				}else{
					return current.object;
				}
			}
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		if(root == null){
			return true;
		}
		return false;
	}

	@Override
	public boolean remove(E e) {
		// TODO Remove node
		return false;
	}

	@Override
	public int size() {
		return ant;
	}
}