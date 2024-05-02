package com.skd.javaeightfeatures;

import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
//		Supplier By using Lambda Expression
		Supplier<String> getName=()-> {
			return "Pavan Kalyan Majji";
		};
		System.out.println(getName.get());
		
//		Supplier By using Anonymous class
		Supplier<Integer> getAge=new Supplier<Integer>() {
			@Override
			public Integer get() {
				return 25;
			}
		};
		System.out.println(getAge.get());
		
//		Supplier By using Method References
		Supplier<String> getFatherName=SupplierExample::getFatherName;
		System.out.println(getFatherName.get());
	}
	
	public static String getFatherName() {
		return "Ramu Majji";
	}
}
