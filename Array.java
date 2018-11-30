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
	
    //	向指定位置添加元素
	public void add(int index, int e) {
		if(size == data.length) {
			throw new IllegalArgumentException("addLast failed.Array is full");
		}
		if (index > size || index < 0) {
			throw new IllegalArgumentException("addLast failed.Index error");
		}
		
		//指定位置的元素向后移动
		for(int i=size-1; i>= index; i--) {
			data[i+1] = data[i];
			
		}
	    data[index] = e;
		size++;
		
	}
	
	
	
	
		

	    
	
}

