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
public class Deal {
	private Date dealDate=new Date();
	private String dealType="";
	private Person person=null;
	private String accountName="";
	private String amount="";
	private String category="";
	private String description="";
	public Deal parseString(String dealString){//
            Deal deal=new Deal();
            return deal;
	}
	public String toPlainText(){
		return dealDate+"\n"+dealType+"\n"+person+"\n"+accountName+"\n"+category+"\n"+description;
	}

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
    public void setDealDate(){
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
}
