package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Date;
import java.util.List;
/**
 *
 * @author Duan
 */
public class Account {
	protected String name;
	protected String type;
	protected String accountNumber;
	protected String description;
	protected Person belongto;
	protected String currency;
	protected List dealList;

        public Account(){
            
        }
	public Account(String name){
            this.name=name;
	}
	public Account(String name,String accountNumber){
            this.name=name;
            this.accountNumber=accountNumber;
	}
        public Account(String name,String accountNumber,Person belongto,String currency){
            this.name=name;
            this.accountNumber=accountNumber;
            this.belongto=belongto;
            this.currency=currency;
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
        @Override
        public String toString(){
            return "\n\tAccount Name:"+this.name+"\n\tAccount Number:"+this.accountNumber+
                    "\n\tBelong to:"+this.belongto;
        }
}
