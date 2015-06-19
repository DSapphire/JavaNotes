/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem4;

/**
 *
 * @author Duan
 */
public class StockDeal extends Deal{
    private boolean isBuy=true;
    private String stockNumber="";
    private String stockName="";
    public Deal parseString(String dealString){//
        return new Deal();
    }
	public String toPlainText(){
		return "";
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
}
