package com.pk.javaeightfeatures;

@FunctionalInterface
interface Father {
	String getName(String name);
}
public class LamdaExpressionExample {
/*
 * Lambda Expression is only for Functional Interface only.
 */
	public static void main(String[] args) {
		Father father=(name)->name;
		System.out.println("Father Name : "+father.getName("Ramu"));
		
		Father object=(name)->{
			return name;
		};
		System.out.println("Son Name : "+object.getName("Pavan Kalyan"));
	}
}
