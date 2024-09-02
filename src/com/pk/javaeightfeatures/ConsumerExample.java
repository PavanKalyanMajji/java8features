package com.pk.javaeightfeatures;

import java.util.function.Consumer;

public class ConsumerExample {
/*
 * Consumer is a functional interface
 * it have one abstract method called accept.
 * accept method have one parameter and return nothing.
 */
	public static void main(String[] args) {
//		Consumer By using Anonymous Class
		Consumer<String> object=new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.print("Name : "+t+", ");
			}
		};
		object.accept("Pavan Kalyan");

//		Consumer By using Lambda Expression
		Consumer<Integer> object1=(age)->System.out.print("Age: "+age+", ");
		object1.accept(25);
		
//		Consumer By using Method References
		Consumer<String> object2=ConsumerExample::getRole;
		object2.accept("Java Developer");
	}
	
	public static void getRole(String role) {
		System.out.print("Role : "+role);
	}
}
