package model;


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Duan
 */
public class StockDeal extends Deal{
    private boolean isBuy=true;
    private String stockNumber="";
    private String stockName="";
    public StockDeal(){
        
    }
    public StockDeal(Date dealDate,
            //String dealType,Person person,String accountName,
            //String stockNumber,String stockName,
            String amount,String des){
        setDealDate(dealDate);
        setCategory("<StockDeal>");
        //setDealType(dealType);
        setAmount(amount);
        //setAccountName(accountName);
        setDescription(des);
       // this.stockName=stockName;
       // this.stockNumber=stockNumber;
       // setPerson(person);
    }
    @Override
    public Deal parseString(String dealString){//
        return this;
    }
    @Override
	public String toPlainText(){
		return "\nCategory:"+this.category+"\nDeal Date:"+this.dealDate+"\nAmount:"+this.amount
                        //+"\nStock Name:"+this.stockName+"\nStock Number:"+this.stockNumber
                        +"\nDescription:"+this.description;
	}
    public boolean isBuy(){
    	return this.isBuy;
    }
    public void setBuy(boolean isBuy){
    	this.isBuy=isBuy;
    }
    public String getStockName(){
    	return this.stockName;
    }
    public void  setStockName(String stockName){
    	this.stockName=stockName;
    }
    public String getStockNumber(){
    	return this.stockNumber;
    }
    public void setStockNumber(String stockNumber){
    	this.stockNumber=stockNumber;
    }
    
    @Override
    public String toString(){
        return toPlainText();
    }
}
