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
public class NormalDeal extends Deal{
	
    public NormalDeal(){
        
    }
    public NormalDeal(Date dealDate,
            //String dealType,Person person,String accountName,
            String amount,String des){
        setDealDate(dealDate);
        setCategory("<NormalDeal>");
        //setDealType(dealType);
        setAmount(amount);
        //setAccountName(accountName);
        setDescription(des);
        //setPerson(person);
    }
    @Override
    public Deal parseString(String dealString){//
           return this;
    }
    @Override
    public String toPlainText(){
           return "\nCategory:"+this.category+"\nDeal Date:"+this.dealDate+"\nAmount:"+this.amount+"\n"
                   + "Description:"+this.description;
    }
    @Override
    public String toString(){
           return "\nCategory:"+this.category+"\nDeal Date:"+this.dealDate+"\nAmount:"+this.amount+"\n"
                   + "Description:"+this.description;
    }
}
