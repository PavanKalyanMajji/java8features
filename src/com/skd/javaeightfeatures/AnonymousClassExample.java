package com.skd.javaeightfeatures;

interface SampleInterface{
	void getName();
	String getLastName();
	int getAge(int age);
}

public class AnonymousClassExample {
	
	public static void main(String[] args) {
//		Anonymous class 
		SampleInterface object=new SampleInterface() {
			
			@Override
			public void getName() {
				System.out.print("Name :Pavan Kalyan ");
			}
			
			@Override
			public String getLastName() {
				return "Majji";
			}
			
			@Override
			public int getAge(int age) {
				return age;
			}
		};
		object.getName();
		System.out.print(object.getLastName()+", age : ");
		System.out.println(object.getAge(25));
	}
}
