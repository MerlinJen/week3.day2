package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] data = {3,2,11,4,6,7};
		List<Integer> t=new ArrayList<Integer>();
for (int i = 0; i < data.length; i++) {
		if(t.isEmpty()) {
			t.add(data[i]);
		}
		else if(t.contains(data[i]));
		else{
			t.add(data[i]);
		}
	}
Collections.sort(t);
System.out.println("Second Largest: " +t.get(t.size()-2));
}}

