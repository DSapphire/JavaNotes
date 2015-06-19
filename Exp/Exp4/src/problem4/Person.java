/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem4;

import java.util.Date;
/**
 *
 * @author Duan
 */
public class Person {
	private String name;
	private String type;
	private String telephone;
	private Date birthday;
	private String description;

	public Person(){

	}

	public Person(String name){
		this.name=name;
	}
	public Person(String name,String type,String telephone,Date birthday,String description){
		this.name=name;
		this.type=type;
		this.telephone=telephone;
		this.birthday=birthday;
		this.description=description;
	}

	public Date getBirthday(){
		return this.birthday;
	}
	public void setBirthday(Date birthday){
		this.birthday=birthday;
	}
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description=description;
	}
	public String getName(){
		return this.name;
	}
	public String getTelephone(){
		return this.telephone;
	}
	public String setTelephone(String telephone){
		return this.telephone=telephone;
	}
	public String getType(){
		return this.type;
	}
	public String setType(String type){
		return this.type=type;
	}
	public String toString(){
		return this.name;
	}
}
