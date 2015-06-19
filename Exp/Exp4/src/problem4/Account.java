/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem4;

import java.util.Date;
import java.util.List;
/**
 *
 * @author Duan
 */
public class Account {
	private String name;
	private String type;
	private String accountNumber;
	private String description;
	private Person belongto;
	private String currency;
	private List dealList;

	public Account(){
		setName("");
	}
	public Account(String name){
		setName(name);
	}

	public String getReport(Date start,Date end,int reportType){//
		String report="";
		return report;
	}
	public String getAccountNumber(){
		return this.accountNumber;
	}
	public void setAccountNumber(String accountNumber){
		this.accountNumber=accountNumber;
	}
	public Person getBelongto(){
		return this.belongto;
	}
	public void setBelongto(Person belongto){
		this.belongto=belongto;
	}
	public String getCurrency(){
		return this.currency;
	}
	public void setCurrency(String currency){
		this.currency=currency;
	}
	public List getDealList(){
		return this.dealList;
	}
	public void setDealList(List dealList){
		this.dealList=dealList;
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
	public void setName(String name){
		this.name=name;
	}
	public String getType(){
		return this.type;
	}
	public void setType(String type){
		this.type=type;
	}
}
