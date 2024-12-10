package com.projectone;

import java.util.ArrayList;
import java.util.List;

class Student{
	private String name;
	private List<String> courses;
	public Student(String name) {
		this.name=name;
		this.courses=new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	public List<String> getCourses(){
		return courses;
	}
	public void enroll(String course) {
		courses.add(course);
		System.out.println(name+" has enrolled in "+course);
	}
	public void drop(String course) {
		if(courses.contains(course)) {
			courses.remove(course);
			System.out.println(name+" has dropped "+course);
		}else {
			System.out.println(name+" is not enrolled in "+course);
		}
	}
}
public class StudentManagementSystem {
	public static void main(String[] args) {
		Student student1=new Student("Mounika");
		Student student2=new Student("Nani");
		student1.enroll("Maths");
		student1.enroll("Social");
		student2.enroll("English");
		student1.drop("Physics");
		System.out.println(student1.getName()+"'s Courses:"+student1.getCourses());
		System.out.println(student2.getName()+"'s Courses:"+student2.getCourses());
	}

}
