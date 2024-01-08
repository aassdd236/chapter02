package com.javaex.ex15;

public class Student extends Person {
	//필드
	private String schoolName;

	//생성자
	public Student() {
		System.out.println("student()");
	}
	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Student(2)");
	}
	public Student(String name, int age, String schoolName) {
		//부모의 생성자 호출;
		super(name, age);
		
		/*super();
		  this.setName(name)
		  this.setAge(ager)*/
		
		//자신의 메모리에 올리는 일
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}
	//메소드 gs
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	//메소드
	@Override
	public String toString() {
		return "학교: " + schoolName + ", 이름: "+getName()+", 나이: "+getAge();
	}
	
}
