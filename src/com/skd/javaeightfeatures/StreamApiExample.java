package com.skd.javaeightfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	private long stuId;
	private String stuName;
	private int studClass;
	private List<String> stuSubjects;

	public Student(long stuId, String stuName, int studClass, List<String> stuSubjects) {
		this.stuId = stuId;
		this.stuName = stuName;
		this.studClass = studClass;
		this.stuSubjects = stuSubjects;
	}

	public long getStuId() {
		return stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public int getStudClass() {
		return studClass;
	}

	public List<String> getStuSubjects() {
		return stuSubjects;
	}

	@Override
	public String toString() {
		return "stuId=" + stuId + ", stuName=" + stuName + ", studClass=" + studClass + ", stuSubjects=" + stuSubjects;
	}
}

public class StreamApiExample {
	public static void main(String[] args) {
		Student student1 = new Student(420, "Pavan Kalyan", 1, Arrays.asList("English", "Telugu", "Tamil"));
		Student student2 = new Student(421, "Pavan", 1, Arrays.asList("English", "Hindi", "Tamil"));
		Student student3 = new Student(420, "Pavan Kalyan", 2, Arrays.asList("English", "Malyalam", "Tamil"));
		Student student4 = new Student(421, "Shyam", 2, Arrays.asList("English", "Sanskrit", "Tamil"));

		List<Student> listOfStudent = Arrays.asList(student1, student2, student3, student4);

		/**
		 * ForEachMethod in java8 feature.
		 */
		// listOfStudent.forEach(System.out::println);

		/**
		 * Student Who starts with name 'P' by using Stream API.
		 */
		List<Student> listOfStudWithNameP = listOfStudent.stream().filter(studentObject -> {
			if (studentObject.getStuName().startsWith("P")) {
				return true;
			}
			return false;
		}).collect(Collectors.toList());
		
		listOfStudWithNameP.forEach(System.out::println);
	}
}
