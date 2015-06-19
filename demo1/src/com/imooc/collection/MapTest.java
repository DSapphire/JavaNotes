package com.imooc.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	
	public Map<String,Student> students;
	
	public MapTest(){
		this.students=new HashMap<String,Student>();
	}
	
	public void testPut(){
		Scanner console=new Scanner(System.in);
		int i=0;
		while(i<3){
			System.out.println("input id:");
			String ID=console.next();
			
			Student st=students.get(ID);
			if(st==null){
				System.out.println("Name");
				String name=console.next();
				Student newStudent=new Student(ID,name);
				students.put(ID, newStudent);
				System.out.println("OK!"+students.get(ID).name);
				i++;
			}else{
				System.out.println("Id used");
				continue;
			}
		}
		
	}
	
	public void testKeySet(){
		//keySet Method
		Set<String> keySet=students.keySet();
		
		System.out.println("Total:"+students.size());
		for(String stuId:keySet){
			Student st=students.get(stuId);
			if(st!=null){
				System.out.println(" "+st.name);
			}
		}
	}
	
	public void testRemove(){
		System.out.println("Enter ID");
		Scanner console=new Scanner(System.in);
		while(true){
			String ID=console.next();
			Student st=students.get(ID);
			if(st==null){
				System.out.println("False, entry again");
				continue;
			}
			students.remove(ID);
			System.out.println("chenggo shanchu"+st.name);
			break;
		}
	}
	
	public void testEntrySet(){
		Set<Entry<String,Student>> entrySet=students.entrySet();
		for(Entry<String,Student> entry:entrySet){
			System.out.println(""+entry.getKey());
			System.out.println(""+entry.getValue().name);
		}
	}
	
	public void testModify(){
		System.out.println("Enter ID to modify");
		Scanner console=new Scanner(System.in);
		while(true){
			String ID=console.next();
			Student st=students.get(ID);
			if(st==null){
				System.out.println("False, entry again");
				continue;
			}
			System.out.println("Name to modify"+st.name);
			System.out.println("Enter name:");
			String name=console.next();
			Student nst=new Student(ID,name);
			students.put(ID,nst);
			System.out.println("ok modify");
			break;
		}
	}
	
	public void testContainsKeyOrValue(){
		System.out.println("s id");
		Scanner console=new Scanner(System.in);
		String id=console.next();
		System.out.println("id"+id+":"+students.containsKey(id));
		if(students.containsKey(id)){
			System.out.println(id+":"+students.get(id).name);
		}
		
		System.out.println("s name");
		String name=console.next();
		System.out.println("name:"+name+":"+students.containsValue(new Student(null,name)));
		if(students.containsValue(new Student(null,name))){
			System.out.println(name+"exist");
		}
		//Student equals
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapTest mt=new MapTest();
		mt.testPut();
		mt.testKeySet();
		
		//mt.testRemove();
		
//		mt.testModify();
//		mt.testEntrySet();
		
		mt.testContainsKeyOrValue();
	}

}
