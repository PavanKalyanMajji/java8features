package com.pk.javaeightfeatures;

@FunctionalInterface
interface Parent{
	void getName(String name);
}

public class MethodReferencesExample {
/*
 * Method References is applicable for functional interface only
 */

	public static void staticMethod(String name) {
		System.out.println("Name: "+name);
	}
	
	public void nonStaticMethod(String name) {
		System.out.println("Name: "+name);
	}
	
	public MethodReferencesExample(String name) {
		System.out.println("Name :"+name);
	}
	public static void main(String[] args) {
//		Reference to a static method. 
		Parent parent=MethodReferencesExample::staticMethod;
		parent.getName("Pavan Kalyan");
		
//		Reference to an instance method.
		Parent parent2=new MethodReferencesExample("Pavan")::nonStaticMethod;
		parent2.getName("Pavan Klayan Majji");
		
//		Reference to a constructor.
		Parent parent3=MethodReferencesExample::new;
		parent3.getName("Majji Ramu");
		
	}
}
