package week3.day2;


import java.util.LinkedHashSet;

public class FindDuplicatesCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		LinkedHashSet<Integer> d=new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(d.add(arr[i])==false) {
				System.out.println("Duplicate Elements are: "+arr[i]);	}	
		}
		}
	}

