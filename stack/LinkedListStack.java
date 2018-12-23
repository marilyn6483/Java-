package javaTest;

public class LinkedListStack<E> implements Stack<E>{
	
	private LinkedList<E> list;
	
	public LinkedListStack() {
		list = new LinkedList();
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return list.getSize();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return list.isEmpty();
	}

	@Override
	public void push(E e) {
		// push
		list.addFirst(e);
		
	}

	@Override
	public E pop() {
		// pop
		E ret = list.removeFirst();
		return ret;
	}

	@Override
	public E peek() {
		// peek
		return list.getFirst();
	}
	
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append("Stack: top ");
		res.append(list);
		return res.toString();
		
	}
	
	public static void main(String[] args) {
		LinkedListStack<Integer> list = new LinkedListStack();
		for (int i = 0; i < 5; i++) {
			list.push(i);
		}
		
		System.out.println(list);
		list.pop();
		System.out.println(list.peek());

		
	}

}
