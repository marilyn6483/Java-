package javaTest;

public class InsertionSort {
	
	public void sort(int[] list) {
		
		for (int i = 1; i < list.length; i++) {
			int currentEle = list[i];
			int k;
			for (k = i - 1; k >= 0 && list[k] > currentEle; k--) {
				list[k+1] = list[k];
			}
			
			list[k+1] = currentEle;
		}
	}

	public static void main(String[] args) {
		// test
		int[] list = {9, 8, 4, 10, -1, 3};
		InsertionSort s = new InsertionSort();
		s.sort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}

	}

}
