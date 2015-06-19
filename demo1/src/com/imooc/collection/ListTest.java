package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 备选课程类
 * @author Duan
 *
 */
public class ListTest {
	public List coursesToSelect;
	
	public ListTest(){
		this.coursesToSelect=new ArrayList();
	}
	
	public void testAdd(){
		//
		Course cr1=new Course("1","DSA");
		coursesToSelect.add(cr1);//重复添加不会检查重复
		System.out.println("DSA");
		
		Course temp=(Course)coursesToSelect.get(0);
		System.out.println("添加了课程"+temp.name);
		
		Course cr2=new Course("2","CProgram");
		coursesToSelect.add(0, cr2);//1 is ok but 2
		Course temp2=(Course)coursesToSelect.get(0);
		System.out.println("添加了课程"+temp2.name);
		
		Course[] course={new Course("3","English"),new Course("4","Math")};
		//coursesToSelect.addAll(Arrays.asList(course));
		coursesToSelect.addAll(1,Arrays.asList(course));
	}
	
	public void testGet(){
		int size=coursesToSelect.size();
		for(int i=0;i<size;i++){
			Course temp=(Course)coursesToSelect.get(i);
			System.out.println("get课程: "+temp.name);
		}
	}
	
	public void testIterator(){
		Iterator it=coursesToSelect.iterator();
		while(it.hasNext()){
			Course temp=(Course)it.next();
			System.out.println("it课程: "+temp.name);
		}
	}
	
	public void testForEach(){
		for(Object obj:coursesToSelect){
			Course temp=(Course)obj;
			System.out.println("FEC课程: "+temp.name);
		}
	}
	
	public void testModify(){
		coursesToSelect.set(0,new Course("5","Writing"));
	}
	
	public void testRemove(){
		//Course temp=(Course)coursesToSelect.get(0);
		//System.out.println("FEC课程: "+temp.name);
		//coursesToSelect.remove(temp);
		//System.out.println("testRemove");
		//coursesToSelect.remove(0);
		//System.out.println("testRemove 0");
		Course[] courses={(Course)coursesToSelect.get(0),(Course)coursesToSelect.get(1)};
		coursesToSelect.removeAll(Arrays.asList(courses));
		System.out.println();
		testForEach();
	}

	public static void main(String[] args){
		ListTest lt=new ListTest();
		lt.testAdd();
		//lt.testGet();
		//lt.testIterator();
		lt.testForEach();
		System.out.println();
		lt.testModify();
		System.out.println();
		lt.testForEach();

		lt.testRemove();
		
	}
}
