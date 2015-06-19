package com.imooc.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
	public List<Course> courses;//Generic
	public TestGeneric(){
		this.courses=new ArrayList<Course>();
	}

	public void testAdd(){
		Course cr1=new Course("1","DSA");
		courses.add(cr1);
		//courses.add("safdggg");
		Course cr2=new Course("2","Java");
		courses.add(cr2);
	}

	public void testChild(){
		ChildCourse ccr=new ChildCourse("3","ccr Python");
		courses.add(ccr);
	}
	public void testForEach(){
		System.out.println("testForEach ");
		for(Course cr:courses){
			System.out.println(cr.id +":"+cr.name);
		}
	}
	public static void main(String[] args) {
		TestGeneric tg=new TestGeneric();
		tg.testAdd();
		tg.testForEach();
		tg.testChild();
		tg.testForEach();
	}
}
