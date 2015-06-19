package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
	public List<Course> coursesToSelect;
	
	private Scanner console;

	public Student student;
	
	public SetTest(){
		coursesToSelect=new ArrayList<Course>();
		console=new Scanner(System.in);
	}

	public void testAdd(){
		//
		Course cr1=new Course("1","DSA");
		coursesToSelect.add(cr1);
		//System.out.println("DSA");
		
		//Course temp=(Course)coursesToSelect.get(0);
		//System.out.println(" "+temp.name);
		
		Course cr2=new Course("2","CProgram");
		coursesToSelect.add(0, cr2);//1 is ok but 2
		//Course temp2=(Course)coursesToSelect.get(0);
		//System.out.println(" "+temp2.name);
		
		Course[] course={new Course("3","English"),new Course("4","Math")};
		//coursesToSelect.addAll(Arrays.asList(course));
		coursesToSelect.addAll(1,Arrays.asList(course));
	}

	public void testForEach(){
		for(Object obj:coursesToSelect){
			Course temp=(Course)obj;
			System.out.println("FEC : "+temp.id+":"+ temp.name);
		}
	}
	
	public void testForEachForSet(Student student){
		for(Course cr:student.courses){//set can't use get()Method
			System.out.println("Select:"+cr.id+": "+cr.name);
		}
	}
	public void testListContains(){
		Course course=coursesToSelect.get(0);
		System.out.println("qudekecheng "+course.name);
		System.out.println(" "+course.name+coursesToSelect.contains(course));
		Course course2=new Course(course.id,course.name);
		//false?!need equals rewrite in Class Course
		System.out.println(" "+course2.name+coursesToSelect.contains(course2));
		if(coursesToSelect.contains(course2)){
			System.out.println(" "+course2.name+coursesToSelect.indexOf(course2));
		}
		
	}
	
	public void createStudentAndSelectCourse(){

		student=new Student("1","Ming");
		System.out.println("Welcome!");

		for(int i=0;i<3;i++){
			System.out.println("ID inpute");
			String courseId=console.next();
			for(Course cr:coursesToSelect){
				if(cr.id.equals(courseId)){
					student.courses.add(cr);
				}
			}
		}
	}
	
	public void testSetContains(){
		System.out.println("course name inpute");
		String name=console.next();
		Course course2=new Course();
		course2.name=name;
		System.out.println(" "+course2.name+student.courses.contains(course2));
		//HashCode() need rewrite
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetTest st=new SetTest();
		st.testAdd();
 		st.testForEach();
 		st.testListContains();
 		
//		st.createStudentAndSelectCourse();
//		st.testSetContains();
		
// 		st.testForEachForSet(student);

	}

}
