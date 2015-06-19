package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author Duan
 */
public abstract class Deal implements Comparable<Deal>,Serializable{
	protected Date dealDate=new Date();
	protected String dealType="";
	protected Person person=null;
	protected String accountName="";
	protected String amount="";
	protected String category="";
	protected String description="";
	public abstract Deal parseString(String dealString);
	public abstract String toPlainText();

	public String getAccountName(){
		return this.accountName;
	}
	public void setAccountName(String accountName){
		this.accountName=accountName;
	}
	public String getAmount(){
		return this.amount;
	}
    public void setAmount(String amount){
    	this.amount=amount;
    }
    public String getCategory(){
    	return this.category;
    }
    public void setCategory(String category){
    	this.category=category;
    }
    public Date getDealDate(){
    	return this.dealDate;
    }
    public void setDealDate(Date dealDate){
    	this.dealDate=dealDate;
    }
    public String getDealType(){
    	return this.dealType;
    }
    public void setDealType(String dealType){
    	this.dealType=dealType;
    }
    public String getDescription(){
    	return this.description;
    }
    public void setDescription(String description){
    	this.description=description;
    }
    public Person getPerson(){
    	return this.person;
    }
    public void setPerson(Person person){
    	this.person=person;
    }

    @Override
    public int compareTo(Deal o) {
        return this.dealDate.compareTo(o.dealDate);
    }
}
