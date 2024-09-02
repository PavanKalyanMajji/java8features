package com.pk.javaeightfeatures;

interface DefaultAndStatic {
/*
 * in Java 8 Default & static methods are allowed inside interface.
 */
	default String getName(String name) {
		return name;
	}
	
	static int getAge(int age) {
		return age;
	}
	
}

class DefaultAndStaticClass implements DefaultAndStatic{
	
}
public class StaticAndDefaultMethods {
	
	public static void main(String[] args) {
//		Up-casting :- Sub class object storing inside a Super class reference.
		DefaultAndStatic object=new DefaultAndStaticClass();
		
		System.out.println("Name : "+object.getName("Pavan Kalyan ")+",Age : "+DefaultAndStatic.getAge(25));

	}
}
