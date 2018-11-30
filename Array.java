package javaTest;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Array {
	
	public enum Season{
		Spring, Summer, Autumn, Winter
	}
	
	public static void main(String [] args) {
		
		ArrayList<String> c = new ArrayList<>();
		
		c.add("q");
		c.add("a");
		c.add("b");
		c.add("c");
		c.remove("q"); 
		Object[] o = c.toArray();
		System.out.println(o);
		for (Object i : o) {
			System.out.println(i);
		}
		

	    
	}
	
}

