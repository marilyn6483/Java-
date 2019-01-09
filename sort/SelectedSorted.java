package javaTest;

public class SelectedSorted {
	
	public static int[] sort(int[] arr) {
		
		for (int i = 0; i < arr.length - 1; i++) {
			int currentMin = arr[i];
			
			for (int j = i + 1; j < arr.length; j++) {
				if (currentMin > arr[j]) {
					int temp = arr[j];
					arr[j] = currentMin;
					arr[i] = temp;
					currentMin = temp;
				}
				
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 11, 2, 6, 8, 7};
		int[] sortedArr = sort(arr);
		for (int i = 0; i < sortedArr.length; i++) {
			System.out.println(sortedArr[i]);
			
		}
	}

}
