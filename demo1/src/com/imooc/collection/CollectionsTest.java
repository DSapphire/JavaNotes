package com.imooc.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsTest {
	
	public void testSort1(){
		List<Integer> integerList=new ArrayList<Integer>();
		Random random=new Random();
		int k;
		for(int i=0;i<10;i++){
			do{
				k=random.nextInt(100);
			}while(integerList.contains(k));
			integerList.add(k);
			System.out.println("+"+k);
		}
		System.out.println("--qian----");
		for(Integer integer:integerList){
			System.out.println(":"+integer);
		}
		Collections.sort(integerList);
		System.out.println("---hou---");
		for(Integer integer:integerList){
			System.out.println(":"+integer);
		}
	}

	public void testSort2(){
		List<String> stringList=new ArrayList<String>();
		stringList.add("microsoft");
		stringList.add("Microsoft");
		stringList.add("google");
		stringList.add("lenovo");
		
		System.out.println("--qian----");
		for(String string:stringList){
			System.out.println(":"+string);
		}
		Collections.sort(stringList);
		System.out.println("---hou---");
		for(String string:stringList){
			System.out.println(":"+string);
		}
	}
	
	public void testsort3(){
		List<Student> studentList=new ArrayList<Student>();
		Random random=new Random();
		
		studentList.add(new Student(random.nextInt(10)+"","Tom"));
		studentList.add(new Student(random.nextInt(10)+"","Jack"));
		studentList.add(new Student(random.nextInt(10)+"","David"));
		studentList.add(new Student("1000","Lucy"));
		System.out.println("--qian----");
		for(Student student:studentList){
			System.out.println("qian:"+student.id+":"+student.name);
		}
		System.out.println("---hou----");
		Collections.sort(studentList);//Student没有实现comparable接口
		for(Student student:studentList){
			System.out.println("qian:"+student.id+":"+student.name);
		}
		System.out.println("---name hou----");
		Collections.sort(studentList, new StudentComparator());
		for(Student student:studentList){
			System.out.println("qian:"+student.id+":"+student.name);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CollectionsTest ct=new CollectionsTest();
		//ct.testSort1();
		//ct.testSort2();
		ct.testsort3();
	}

}
