package week3.day2;


import java.util.Arrays;
import java.util.LinkedHashSet;

public abstract class FindIntersectionCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer[] a={3,2,11,4,6,7};
Integer[] b={1,2,8,4,9,7};
LinkedHashSet<Integer> c= new LinkedHashSet<Integer>();
c.addAll(Arrays.asList(a));
c.retainAll(Arrays.asList(b));
System.out.println("The  Array Intersection is: "+c);
Integer[]  intersection= {};
intersection=c.toArray(intersection);
System.out.println(Arrays.toString(intersection));

	}}

