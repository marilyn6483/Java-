package LinkedList;

import javaTest.LinkedList;

public class LinkedListQueue<E> implements Queue<E>{
	
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
	
	private Node head, tail;
	private int size;
	
	public LinkedListQueue() {
		head = null;
		tail = null;
		size = 0;
	}


	@Override
	public int getSize() {
		// return size of queue
		return size;
	}



	@Override
	public boolean isEmpty() {
		// if queue is empty
		return size == 0;
	}



	@Override
	public E dequeue() {
		// get out of queue
		
		if (isEmpty()) {
			throw new IllegalArgumentException("cannot dequeue from an empty queue");
		}
		Node retNode = head;
		
		E ret = retNode.e;
		
		head.next = head;
		retNode.next = null;
		if (head == null) {
			tail = null;
		}
		size--;
		return ret;
	}



	@Override
	public E getFront() {
		// get front element of queue
		
		if (isEmpty()) {
			throw new IllegalArgumentException("cannot dequeue from an empty queue");
		}
		return head.e;
	}



	@Override
	public void enqueue(E e) {
		// enqueue
		
		if (tail == null) {
			Node tail = new Node(e);
			head = tail;
			
		}else {
			tail.next = new Node(e);
			tail = tail.next;
		}
		size++;
		
	}
	
	@Override
	public String toString() {	
		
		StringBuilder res = new StringBuilder();
		res.append("Queue front ");
		// ʹ��forѭ��
		// for (Node cur = dummyhead.next; cur != null; cur = cur.next)
		Node cur = head;
		while(cur != null) {
			res.append(cur + "->");
			cur = cur.next;
		}
		res.append("NULL tail");
		return res.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
