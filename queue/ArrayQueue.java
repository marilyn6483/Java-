package javaTest;

public class ArrayQueue<E> implements Queue<E>{
	private Array<E> array;
	
	ArrayQueue(int capacity){
		array = new Array<>(capacity);
	}
	
	ArrayQueue(){
		array = new Array<>();
	}
	
	@Override
	public int getSize(){
		return array.getSize();
	}
	
	@Override
	public boolean isEmpty() {
		return array.isEmpty();
	}
	
	@Override
	public void enqueue(E e) {
		array.addLast(e);
	}
	
	@Override
	public E dequeue() {
		return array.removeFirst();
	}
	
	@Override
	public E getFront() {
		return array.getFirst();
		
	}
	
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append("Queue: ");
		res.append("front [");
		for (int i=0; i <= array.getSize()-1; i++) {
			res.append(array.get(i));
			if (i != array.getSize() - 1) {
				res.append(',');
			}
		}
		res.append("] tail");
		return res.toString();
	}
	
	public static void main(String args[]) {
		ArrayQueue<Integer> queue = new ArrayQueue<>();
		for(int i = 0; i < 10; i++) {
			queue.enqueue(i);
		}
		
		System.out.println(queue);
		System.out.println(queue.getSize());
		System.out.println(queue.getFront());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}

}
