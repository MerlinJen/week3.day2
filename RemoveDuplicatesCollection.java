package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		 Set<String> txt = new LinkedHashSet<String>();
		 String[] arr = text.split(" ");

		 for ( String ss : arr)
		      txt.add(ss);

		 String newl = txt.toString()
		          .replace("[","")
		          .replace("]","")
		          .replace(",","");

		 System.out.println(newl);}}
	