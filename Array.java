package javaTest;

import java.util.*;

public class Array {
	private int[] data;
	private int size;
	
	public Array(int capacity) {
		data = new int[capacity];
		size = 0;
	}
	
    //	�޲����Ĺ��캯��
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
	
    //	���Ԫ��,��ĩβ���һ��Ԫ��
	public void addLast(int e) {
//		if(size == data.length) {
//			throw new IllegalArgumentException("addLast failed.Array is full");
//		}
//		data[size] = e;
//		size++;
		add(size, e);
	}
	
	public void addFirst(int e) {
		add(0, e);
	}
	
    //	��ָ��λ�����Ԫ��
	public void add(int index, int e) {
		if(size == data.length) {
			throw new IllegalArgumentException("add failed.Array is full");
		}
		if (index > size || index < 0) {
			throw new IllegalArgumentException("add failed.Index error");
		}
		
		//ָ��λ�õ�Ԫ������ƶ�
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
	
	int get(int index) {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("Index is Illegal");
		}
		return data[index];
	}
	void set(int index, int e) {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("Index is Illegal");
		}
		data[index] = e;
	}
	
//	�Ƿ����ĳ��Ԫ��
	public boolean contains(int e) {
		
		for (int i=0; i<size; i++) {
			if (data[i] == e)
				return true;		
		}
		return false;
		
	}
	
//	����ָ��Ԫ�ص�����
	public int find(int e) {
		for (int i=0; i<size; i++) {
			if (data[i] == e)
				return i;		
		}
		return -1;
	}
	
//	ɾ��Ԫ�أ������ر�ɾ����Ԫ��
	public int remove(int index) {
		
		if(index < 0 || index >= size) {
			throw new IllegalArgumentException("Illegal index.");
		}
		
		int num = data[index];
		for(int i=index+1; i<size; i++) {
			data[i-1] = data[i];
		}
		size--;
		return num;
	}
	
	public void removeElement(int e) {
		
		if (contains(e)) {
			   int index = find(e);
			   remove(index);
		   }
	}
	   
	
}

