package backEnd.trees;

import java.util.Iterator;

public class GenericTree<E extends Comparable <E>> implements TreeInterface<E> {
	
	public Node root;
	Node current;
	Node setIn;
	int ant;
	
	public GenericTree(){
		ant = 0;
		root = null;
	}
	
	public class Node{
		public Node left;
		public Node right;
		public E object;
		
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
		Node previous = null;
		if(isEmpty()){
			root = setIn;
			ant++;
			return true;
		}
		current = root;
		while(current != null){
			if(setIn.object.compareTo(current.object)<0){
				previous = current;
				current = current.right;
			}else if(setIn.object.compareTo(current.object)>0){
				previous = current;
				current = current.left;
			}else if(setIn.object.compareTo(current.object)==0){
				return false;
			}
		
		}
		if(previous.object.compareTo(setIn.object)<0){
			previous.right = setIn;
		}else if(previous.object.compareTo(setIn.object)>0){
			previous.left = setIn;
		}
		ant++;
		return true;
	}

	@Override
	public void clear() {
		root = null;
		ant = 0;
	}

	@Override
	public boolean contains(E e) {
		setIn = new Node(e);
		current = root;
		while(current != null){
			if(setIn.object.compareTo(current.object)==0){
				return true;
			}else if(current.object.compareTo(setIn.object)<0){
				current = current.right;
			}else if(current.object.compareTo(setIn.object)>0){
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