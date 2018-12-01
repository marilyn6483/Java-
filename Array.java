package javaTest;

import java.util.*;

public class Array<E> {
//	使用泛型
	private E[] data;
	private int size;
	
	public Array(int capacity) {
		data = (E[]) new Object[capacity];
		size = 0;
	}
	
    //	无参数的构造函数
	public Array() {
		this(10);
	}
	
	public int getSize() {
		return size;
	}
	
	public int getCapacity() {
		return data.length;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
    //	添加元素,向末尾添加一个元素
	public void addLast(E e) {
//		if(size == data.length) {
//			throw new IllegalArgumentException("addLast failed.Array is full");
//		}
//		data[size] = e;
//		size++;
		add(size, e);
	}
	
	public void addFirst(E e) {
		add(0, e);
	}
	
    //	向指定位置添加元素
	public void add(int index, E e) {
		if(size == data.length) {
			throw new IllegalArgumentException("add failed.Array is full");
		}
		if (index > size || index < 0) {
			throw new IllegalArgumentException("add failed.Index error");
		}
		
		//指定位置的元素向后移动
		for(int i=size-1; i>= index; i--) {
			data[i+1] = data[i];
			
		}
	    data[index] = e;
		size++;
		
	}
	
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));
		res.append('[');
		for (int i=0; i <= size-1; i++) {
			res.append(data[i]);
			if (i != size - 1) {
				res.append(',');
			}
		}
		res.append(']');
		return res.toString();
		}
	
	E get(int index) {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("Index is Illegal");
		}
		return data[index];
	}
	void set(int index, E e) {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("Index is Illegal");
		}
		data[index] = e;
	}
	
//	是否包含某个元素
	public boolean contains(E e) {
		
		for (int i=0; i<size; i++) {
			if (data[i].equals(e))
				return true;		
		}
		return false;
		
	}
	
//	查找指定元素的索引
	public int find(E e) {
		for (int i=0; i<size; i++) {
			if (data[i].equals(e))
				return i;		
		}
		return -1;
	}
	
//	删除元素，并返回被删除的元素
	public E remove(int index) {
		
		if(index < 0 || index >= size) {
			throw new IllegalArgumentException("Illegal index.");
		}
		
		E num = data[index];
		for(int i=index+1; i<size; i++) {
			data[i-1] = data[i];
		}
		size--;
		return num;
	}
	
	public void removeElement(E e) {
		
		if (contains(e)) {
			   int index = find(e);
			   remove(index);
		   }
	}
	   
	
}

