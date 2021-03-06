/**
 * 
 */
package javaTest;

/**
 * @author chenyanyan
 *
 */
public class ArrayStack<E> implements Stack<E>{
	
	Array<E> array;
	
	public ArrayStack(int capacity) {
		array = new Array<>(capacity);
	}
	
	public ArrayStack() {
		array = new Array<>();
	}

	@Override
	public int getSize() {
		return array.getSize();
	}
	
	@Override
	public boolean isEmpty() {
		return array.isEmpty();
	}
	
	public int getCapacity() {
		return array.getCapacity();
	}
	
	@Override
	public void push(E e) {
		array.addLast(e);
	}
	
	@Override
	public E pop() {
		return array.removeLast();
	}
	
	@Override
	public E peek() {
//		查看栈顶的数据
		return array.getLast();
		
	}
	
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append("Stack: ");
		res.append("[");
		for (int i = 0; i < array.getSize(); i++) {
			res.append(array.get(i));
			if (i != array.getSize() - 1) {
				res.append(",");
			}
			
		}
		res.append("] top");
		return res.toString();
	}
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
