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

		Node prv = dummyhead;
		for(int i = 0; i < index; i++) {
			prv = prv.next;
			
		}
        prv.next = new Node(e, prv.next);
		size++;
		
	}
	
	public void addLast(E e) {
		add(size, e);
	}
	
	public E get(int index) {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("Index error");
		}
		
		Node cur = dummyhead.next;
		for (int i = 0; i < index; i++) {
			cur = cur.next;
		}
		
		return cur.e;
	}
	
	public E getFirst() {
		return get(0);
	}
	
	public E getLast() {
		return get(size-1);
	}
	
	//更新index位置的元素为e， 不常用
	public void set(int index, E e) {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("Index error");
		}
		
		Node cur = dummyhead.next;
		
		for (int i = 0; i < index; i++) {
			cur = cur.next;
		}
		cur.e = e;
	}
	
	public boolean contains(E e) {
		
		boolean contain = false;
		
        Node cur = dummyhead.next;
		
		for (int i = 0; i < size; i++) {
			cur = cur.next;
			if (e.equals(cur.e)) {
				contain = true;
				return contain;
			}
		}
		
		return contain;
		
	}
	
	@Override
	public String toString() {	
		
		StringBuilder res = new StringBuilder();
		res.append("LinkedList ");
		// 使用for循环
		// for (Node cur = dummyhead.next; cur != null; cur = cur.next)
		Node cur = dummyhead.next;
		while(cur != null) {
			res.append(cur + "->");
			cur = cur.next;
		}
		res.append("NULL");
		return res.toString();
	}
	
	//test
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 0; i < 5; i++) {
			list.addFirst(i);
		}
		System.out.println(list);
		list.add(2, 666);
		System.out.println(list);
	}
	

	
}
