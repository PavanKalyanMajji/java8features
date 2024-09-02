package com.pk.javaeightfeatures;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
//		Predicate By using Anonymous Class
		Predicate<Integer> validateAge = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				if (t<21) {
					return false;
				} else {
					return true;
				}
			}
		};
		System.out.println(validateAge.test(21));
		
//		Predicate By using Lambda Expression
		Predicate<String> validateName = (name) -> {
			if(name.equalsIgnoreCase("Pavan Kalyan"))
				return true;
			else 
				return false;
		};
		
		System.out.println(validateName.test("Pavan Kalyan majji"));
		
//		Predicate By using Method References
		Predicate <String> validateLastName =PredicateExample::validateLastName;
		System.out.println(validateLastName.test("Majji"));
	}
	
	public static boolean validateLastName(String lastName) {
		if(lastName.equalsIgnoreCase("Majji"))
			return true;
		else
			return false;
	}
}
