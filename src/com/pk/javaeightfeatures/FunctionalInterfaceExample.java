package com.pk.javaeightfeatures;

@FunctionalInterface
interface SampleFunctionalInterface{
/*
 * interface have only one abstract method then interface called as functional interface
 * example: - Runnable interface it contains only one abstract method run method.
 * it can allows number of default and static methods inside.
 */
	public abstract void functionalInterface();
	
	default void getMethodName() {
		System.out.println("default Method");
	}
	
	static void getMethodname(String name) {
		System.out.println("static method ");
	}
}
public class FunctionalInterfaceExample {
	public static void main(String[] args) {
		SampleFunctionalInterface.getMethodname("Pavan");
	}
}
