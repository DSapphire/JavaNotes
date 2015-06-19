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
public class TransferDeal extends Deal{
    private Account inputAccount;
    private Account outputAccount;
    public TransferDeal(){

    }
    public TransferDeal(Date dealDate,
           // String dealType,Account inputAccount,Account outputAccount,
            String amount,String des){
        setCategory("<TransferDeal>");
        setDealDate(dealDate);
        //setDealType(dealType);
        setAmount(amount);
        //this.inputAccount=inputAccount;
        //this.outputAccount=outputAccount;
        setDescription(des);
    }
    @Override
    public Deal parseString(String dealString){//
        return this;
    }
    @Override
    public String toPlainText(){
        return "\nCategory:"+this.category+"\nDeal Date:"+this.dealDate+"\nAmount:"+this.amount
                //+"\nInputAccount:"+this.inputAccount+"\nOutputAccount:"+this.outputAccount
                +"\nDescription:"+this.description;
    }
    public void setInputAccount(Account inputAccount){
        this.inputAccount=inputAccount;
    }
    public Account getInputAccount(){
        return this.inputAccount;
    }
    public void setOutputAccount(Account outputAccount){
        this.outputAccount=outputAccount;
    }
    public Account getOutputAccount(){
        return this.outputAccount;
    }
    @Override
    public String toString(){
        return toPlainText();
    }
}
