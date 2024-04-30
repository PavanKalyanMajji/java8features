package com.skd.javaeightfeatures;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethodExample {
	public static void main(String[] args) {
		List<String> listOfNames=new ArrayList<String>();
		
		listOfNames.add("Pavan Kalyan M");
		listOfNames.add("Vivek A");
		listOfNames.add("Vivek K");
		listOfNames.add("Vikas ");
		listOfNames.add("Pavithra ");
		listOfNames.add("Chandana A");
		
		System.out.println(listOfNames);
		
//		For Each method is used to iterate one by one 
		
		listOfNames.forEach(name -> System.out.println(name));
	}
}
