package com.skd.javaeightfeatures;

import java.util.Optional;

public class OptionalCalssExample {
	public static void main(String[] args) {
//		empty method always return Empty Optional class Object
		Optional<Integer> optionalObject= Optional.empty();// it gives Empty Optional class Object
		System.out.println(optionalObject);
		
//		of method if value is their it return value or else throw exception.
		Optional<String> name=Optional.of("Pavan");
		System.out.println(name.get());
		
//		ofNullable return optional Object with value if present or else it return empty optional Object.
		Optional<String> validateName=Optional.ofNullable("Pavan Kalyan");
		System.out.println(validateName);
		
//		isPresent is non-static method it return true if value present or else return false.
		if(validateName.isPresent()) {
//			get method return the value from Optional class container.
			String getName=validateName.get();
			System.out.println(getName);
		}
		
		String finalOutput=validateName.filter((nameValidation)-> {
			if(nameValidation.equalsIgnoreCase("Pavan Kalyan"))
				return true;
			else 
				return false;
		}).map(x -> x).orElse("Name Not Matched");
		
		System.out.println(finalOutput);
	}
}
