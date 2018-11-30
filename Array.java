package javaTest;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
			throw new IllegalArgumentException("addLast failed.Array is full");
		}
		if (index > size || index < 0) {
			throw new IllegalArgumentException("addLast failed.Index error");
		}
		
		//ָ��λ�õ�Ԫ������ƶ�
		for(int i=size-1; i>= index; i--) {
			data[i+1] = data[i];
			
		}
	    data[index] = e;
		size++;
		
	}
	
	
	
	
		

	    
	
}

