package javaTest;

public class LinkedList<E> {
	
	private class Node{
		public E e;
		public Node next;
		
		public Node(E e, Node next) {
			this.e = e;
			this.next = next;
		}
		
		public Node(E e) {
			this(e, null);
		}
		
		public Node() {
			this(null, null);
		}
		
		@Override
		public String toString() {
			return e.toString();
		}
	}
	
//	private Node head;
	private int size;
	private Node dummyhead;
	
	LinkedList(){
//		head = null;
		size = 0;
		dummyhead = new Node(null, null);
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void addFirst(E e) {
//		Node node = new Node(e);
//		node.next = head;
//		head = node;
//		head = new Node(e, head);
//		dummyhead.next = head;
//		
//		size++;
		add(0, e);
		
	}
	
	
	public void add(int index, E e) {
		
		if (index < 0 || index > size) {
			throw new IllegalArgumentException("Add failed. Illegal index.");
		}

//			Node prv = head;
			Node prv = dummyhead;
			for(int i = 0; i < index; i++) {
				prv = prv.next;
				

			
//			Node node = new Node(e);
//			node.next = prv.next;
//			prv.next = node;
			prv.next = new Node(e, prv.next);
			
			
			size++;
		}
		
	}
	
	public void addLast(E e) {
		add(size, e);
	}
	
	

	
}
