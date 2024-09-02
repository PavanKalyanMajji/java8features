package com.pk.javaeightfeatures;

import java.util.NoSuchElementException;
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

//		filter is used to filter the value as per required.
//		map is used to perform task and return the value again.
//		orElse is used if value not their in optional container it will supply value as per required.
		String finalOutput=validateName.filter((nameValidation)-> {
			if(nameValidation.equalsIgnoreCase("Pavan Kalyan"))
				return true;
			else 
				return false;
		}).map(x -> x).orElse("Name Not Matched");
		System.out.println(finalOutput);
		
//		ifPresent consume the value
		validateName.ifPresent(output -> System.out.println(output));
		
//		orElseThrow will throw the exception when value is null.
//		Optional.ofNullable(null).map(output -> output).orElseThrow(() -> new NoSuchElementException());
		
//		orElseGet will return the value if value is null or not present in optional container.
		Object value=Optional.ofNullable(null).orElseGet(()-> "No Value Present");
		System.out.println(value);
		
	}
}
