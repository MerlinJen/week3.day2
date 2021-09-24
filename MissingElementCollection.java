package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		List<Integer> list = new ArrayList<Integer>();
		for (int i = arr[0]; i < arr[arr.length-1]; i++) {
		list.add(i);
		}
		System.out.println(list);
		for(int i=0;i<arr.length;i++) {
			list.remove(arr[i]);	
		}
		System.out.println(list);
		for(int s:list) {
			System.out.println("The Missing Element is: " +s);
		}
	}

}

